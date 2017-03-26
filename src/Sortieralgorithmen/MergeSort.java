package Sortieralgorithmen;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class MergeSort extends Sortieralgorithmus {
    @Override
    public void sort(int[] a) {
        mergeSort(a,0,a.length-1);
    }

    private static void mergeSort(int[] a, int l, int r){
        if (l < r) {
            int q = (l + r) / 2;

            mergeSort(a,l, q);
            mergeSort(a,q + 1, r);
            merge(a, l, q, r);
        }
    }

    private static void merge(int[] a, int l, int q, int r) {
        int[] arr = new int[a.length];
        int i, j;
        for (i = l; i <= q; i++) {
            arr[i] = a[i];
        }
        for (j = q + 1; j <= r; j++) {
            arr[r + q + 1 - j] = a[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (arr[i] <= arr[j]) {
                a[k] = arr[i];
                i++;
            } else {
                a[k] = arr[j];
                j--;
            }
        }
    }

}
