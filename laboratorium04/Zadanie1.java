package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;
public class Zadanie1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> nowy = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            nowy.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            nowy.add(b.get(i));
        }
        return nowy;
    }
}
