package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;

public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> nowy = new ArrayList<>();
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < a.size() + b.size(); i++) {
                if (a.get(indexA) <= b.get(indexB)) {
                    nowy.add(a.get(indexA));
                    indexA++;
                } else {
                    nowy.add(b.get(indexB));
                    indexB++;
                }
                if (indexA >= a.size()) {
                    while (indexB < b.size()) {
                        nowy.add(b.get(indexB));
                        indexB++;
                    }
                    return nowy;
                }
                if (indexB >= b.size()) {
                    while (indexA < a.size()) {
                        nowy.add(a.get(indexA));
                        indexA++;
                    }
                    return nowy;
                }
        }
        return nowy;
    }
}
