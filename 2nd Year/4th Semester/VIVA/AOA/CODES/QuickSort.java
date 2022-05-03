//if(lb < ub) { loc = QS(lb, ub), QS(lb, loc -1), QS(loc + 1, ub). }
//keep on swapping start and end.
//check if (start < end) { swap start and end. } else { swap pivot and end. }

class QuickSort {
	static int[] a = {7, 6, 5, 4, 3, 2, 1};
	public static void main(String...args) {
		quickSort(0, a.length-1);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void quickSort(int lb, int ub) {
		if(lb < ub) {
			int loc = partition(lb, ub);
			partition(lb, loc - 1);
			partition(loc + 1, ub);
		}
	}

	public static int partition(int lb, int ub) {
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		while(start < end) {
			while(a[start] <= pivot) {
				if(start == ub) {
					a[lb] = a[end];
					a[end] = pivot;
					return end;
				}
				start++;
			}
			while(a[end] > pivot)
				end--;
			if(start < end) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
		}
		a[lb] = a[end];
		a[end] = pivot;
		return end;
	}
}