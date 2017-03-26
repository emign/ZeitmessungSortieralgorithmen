package Sortieralgorithmen;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class BogoSort extends Sortieralgorithmus {
    @Override
    public void sort(int[] a) {
        while(!isSorted(a)) {
            shuffle(a);
        }
    }

    private void shuffle(int[] a) {
        for(int x = 0; x < a.length; ++x) {
            int index1 = (int) (Math.random() * a.length),
                    index2 = (int) (Math.random() * a.length);
            int y = a[index1];
            a[index1] = a[index2];
            a[index2] = y;
        }
    }

    private boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;
            }
        }
        return true;
    }
}
