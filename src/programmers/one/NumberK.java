package programmers.one;

public class NumberK {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3},{4, 4, 1}, {1, 7, 3}};
		StringBuilder sb = new StringBuilder();
		// i 부터 j까지 자르고 정렬 후 k번째 값 출력하기
		int a = 0;
		int b = 0;
		int c = 0;
		int[] temp;
		for(int i = 0; i < commands.length; i++) {
			a = commands[i][0];
			b = commands[i][1];
			c = commands[i][2];
			temp = new int[b - a + 1];
			int cnt = 0;
			for(int j = a - 1; j < b; j++) {
				temp[cnt] = arr[j]; 
					cnt++;
			}
			cnt = 0;
			sort(temp, 0, temp.length - 1);
			sb.append(temp[c]).append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static void sort(int[] arr, int l, int r) {
		//재귀함수 종료 시점
		if(l < r) {
			
			int p = partition(arr, l, r);
			//왼쪽부분 재귀
			sort(arr, l, p -1);
			//오른쪽부분 재귀
			sort(arr, p - 1, r);
		}
	}
	
	public static int partition(int arr[], int l, int r) {
		//가장 오른쪽을 기준으로 잡는다
		int pivot = arr[r];
		//pivot보다 작은 값 왼쪽으로 몰기위해 l - 1
		int i = l - 1;
		
		//r 한칸 전 까지 r전까지
		for(int j = l; j < r; j++) {
			int temp;
			if(arr[j] <= pivot) {
				i++;
				//swap
				swap(arr, i, j);
			}
		}
		//pivot 과 i + 1값 바꾸기
		//pivot값을 중간으로 보내기 위해
		swap(arr, i + 1, r);
		return i + 1;
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
}
