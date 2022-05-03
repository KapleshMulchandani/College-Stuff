class InsertionSort {
	static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	public static void main(String...args) {
		int key, n = arr.length;
		for(int i = 0; i < n; i++) {
			key = arr[i];
			int j = i - 1;
			while(j >= 0 && key > arr[j]) {
				arr[j+1] = arr[j];
				arr[j] = key;
				j = j - 1;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}