package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;

public class Zadanie2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> nowy = new ArrayList<>();
        for(int i=0;i<a.size()+b.size();i++){
            if(i<a.size()){
                nowy.add(a.get(i));
            }
            if(i<b.size()){
                nowy.add(b.get(i));
            }
        }
        return nowy;
    }
}
