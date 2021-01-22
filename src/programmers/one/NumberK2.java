package programmers.one;

public class NumberK2 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3},{4, 4, 1}, {1, 7, 3}};
		int[] a = sol(arr, commands);
		for(int b : a) {
			System.out.println(b);
		}
	} 
	public static int[] sol(int[] array, int[][] commands) {
		int[] answer = new int[commands.length]; 
		
		// i 부터 j까지 자르고 정렬 후 k번째 값 출력하기
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] temp;
		for(int i = 0; i < commands.length; i++) {
			a = commands[i][0];
			b = commands[i][1];
			c = commands[i][2];
			temp = new int[b - a + 1];
			int cnt = 0;
			for(int j = a - 1; j < b; j++) {
				temp[cnt] = array[j]; 
				cnt++;
			}
			cnt = 0;
			sort(temp, 0, temp.length - 1);
			answer[d] = temp[c - 1];
			d++;
		}
		return answer;
	}

	public static void sort(int[]arr, int l , int r) {

		if(l < r) {

			int p = partition(arr, l, r);

			sort(arr, l, p -1);
			sort(arr, p + 1, r);
		}
	}

	public static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l - 1;

		for(int j = l; j < r; j++) {
			if(pivot >= arr[j]) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, r);
		return i + 1;

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
