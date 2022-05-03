/*
1. Only 1 element is present. -> Both min and max is that element.
2. Two elements are present. -> Check which is min and which is max.
3. More than two elements are present. -> divide the array into two parts (lb, mid) and (mid+1, ub) and let them return two different sets of mins and max and check which is the min and max of them and return that.

*/

class MinMax {
	static int[] a = {50, 40, -5, -9, 45, 90, 65, 25, 75};
	public static void main(String...args) {
		int[] arr = minMax(0, a.length-1);
		System.out.println(arr[0] + " is the minimum element and " + arr[1] + " is the maximum element."); 
	}

	public static int[] minMax(int i, int j) {
		int min = 0, max = 0;
		if(i - j == 0) 
			min = max = a[i];
		else if(i == j - 1) {
			if(a[i] < a[j]) {
				min = a[i];
				max = a[j];
			}
			else {
				min = a[j];
				max = a[i];
			}
		}
		else {
			int mid = (i+j)/2;
			int[] arr = minMax(i, mid);
			int[] new_arr = minMax(mid+1, j);
			if(arr[0] < new_arr[0])
				min = arr[0];
			else
				min = new_arr[0];
			if(arr[1] > new_arr[1])
				max = arr[1];
			else
				max = new_arr[1];
		}
		int[] finalArr = {min, max};
		return finalArr;
	}
}