package Sortieralgorithmen;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class BubbleSort extends Sortieralgorithmus {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++){
            for (int j = i; j<a.length;j++){
                if (a[j]<a[i]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j]  = tmp;
                }
            }

        }
    }
}
