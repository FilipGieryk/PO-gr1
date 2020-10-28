package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;

public class Zadanie4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> nowy = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--){
            nowy.add(a.get(i));
        }
        return nowy;
    }
}
