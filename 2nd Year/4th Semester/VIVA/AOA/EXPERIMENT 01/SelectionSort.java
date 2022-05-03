//Selection.
//swapping.
//counter shift.

class SelectionSort {
	static int[] arr = {5, 4, 3, 2, 1};
	public static void main(String...args) {
		int min = 0, n = arr.length;
		for(int i = 0; i < n -1; i++) {
			min = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}