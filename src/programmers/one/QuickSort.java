package programmers.one;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 3, 2, 5, 4};
		System.out.println("정렬 전");
		for(int i : arr) {
			System.out.println(i);
		}
		sort(arr, 0, 4);
		System.out.println("정렬 후");
		for(int j : arr) {
			System.out.println(j);
		}
		
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
