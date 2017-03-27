import RandomArray.RandomArray;
import Sortieralgorithmen.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by nicolaiemig on 26.03.17.
 */
public class Run{
    static ArrayList<Sortieralgorithmus> options = new ArrayList<Sortieralgorithmus>();
    static long startZeit;
    static long stopZeit;
    static int[] array;

    static int arrayLaenge = 100;
    static int oberGrenze = 100;



    public static void main(String[] args) {


        Sortieralgorithmus bubbleSort       = new BubbleSort();
        Sortieralgorithmus selectionSort    = new SelectionSort();
        Sortieralgorithmus quickSort        = new QuickSort();
        Sortieralgorithmus mergeSort        = new MergeSort();
        Sortieralgorithmus bogoSort         = new BogoSort();

        options.add(bubbleSort);
        options.add(selectionSort);
        options.add(quickSort);
        options.add(mergeSort);
        options.add(bogoSort);

        showDialog();
    }

    public static void showDialog(){
        array = RandomArray.getOneWithLength(arrayLaenge,oberGrenze);

        int selected = JOptionPane.showOptionDialog(null,
                "<html>Es soll ein Array der Länge " + arrayLaenge + " mit Werten zwischen 0 und " + oberGrenze + " sortiert werden. <br />" +
                        "Hierbei wird die benötigte Zeit auf Nanosekunden genau gestoppt. (Bitte bei Bogosort aufpassen!)</html>" ,
                "Sortieralgorithmen",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options.toArray(), options.get(0));
        if (selected != -1)
            runSorter(selected);
    }

    public static void showResult(){
        JOptionPane.showMessageDialog(null,
                "<html>Die Sortierung dauerte <br />" + (stopZeit-startZeit) + " Nanosekunden" +
                        "</html>",
                "Laufzeit",
                JOptionPane.WARNING_MESSAGE);
    }

    private static void runSorter(int a){
        startZeit = System.nanoTime();
        options.get(a).sort(array);
        stopZeit = System.nanoTime();
        showResult();
        showDialog();
    }
}
