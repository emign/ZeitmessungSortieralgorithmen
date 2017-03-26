package Sortieralgorithmen;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public abstract class Sortieralgorithmus {
    abstract public void sort(int[] a);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
