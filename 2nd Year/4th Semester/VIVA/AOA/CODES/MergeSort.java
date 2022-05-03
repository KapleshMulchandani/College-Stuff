class MergeSort {
    public static void main(String...args) {
        int[] a = {7, 3, 1, 9, 11, 2, 4, 6, 8};
        int n = a.length;
        ms(a, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void ms(int[] a, int lb, int ub) {
        if(lb < ub) {
            int mid = (lb + ub) / 2;
            ms(a, lb, mid);
            ms(a, mid+1, ub);
            merge(a, lb, mid, ub);
        }
    }

    public static void merge(int[] a, int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = a[lb + i];
        for (int j=0; j<n2; ++j)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0;
        int k = lb;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
