package Sortieralgorithmen;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class QuickSort extends Sortieralgorithmus {
    @Override
    public void sort(int[] a) {
        QuickSort.quickSort(a,0,a.length-1);

    }

    private static void quickSort(int[] a, int links, int rechts) {
        int l = links;
        int r = rechts;
        int pivot = a[(l + r) / 2];
        while (l < r) {
            while (a[l] < pivot) l++;
            while (a[r] > pivot) r--;
            if (l<=r) {
                int tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
                l++;
                r--;
            }
        }
        if (l<rechts) quickSort(a,l,rechts);
        if (r>links) quickSort(a,links,r);
    }
}
