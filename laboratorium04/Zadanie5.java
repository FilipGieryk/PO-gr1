package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;

public class Zadanie5 {
    public static void reverse(ArrayList<Integer> a) {
        ArrayList<Integer> temp = new ArrayList<>(a);
        int index =0;
        for (int i = a.size() - 1; i >= 0; i--) {
            a.set(index,temp.get(i));
            index++;
        }
    }
}
