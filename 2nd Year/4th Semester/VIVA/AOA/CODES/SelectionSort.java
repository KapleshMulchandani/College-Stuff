//Selection.
//swapping.
//counter shift.

class SelectionSort {
	static int[] arr = {1, 2, 3, 4, 5};
	public static void main(String...args) {
		int max = 0, n = arr.length;
		for(int i = 0; i < n -1; i++) {
			max = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}