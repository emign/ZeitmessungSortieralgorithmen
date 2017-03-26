package RandomArray;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class RandomArray {
    public static int[] getOneWithLength(int length, int oberGrenze){
        int[] a = new int[length];
        for (int i = 0; i < a.length;i++){
            a[i] = (int)(Math.random()*oberGrenze);
        }
        return a;
    }
}
