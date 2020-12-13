package pl.imiajd.Gieryk;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> tmp=new ArrayList<T>(tab);
        Collections.sort(tmp);
        return tab.equals(tmp);
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T szukanyObiekt) {
        if (ArrayUtil.isSorted(tab)) {
            int lewo = 0;
            int prawo = tab.size() - 1;
            int srodek = 0;

            while (lewo <= prawo) {
                srodek = (lewo + prawo) / 2;
                if (tab.get(srodek).equals(szukanyObiekt)) {
                    return srodek;
                }
                if (tab.get(srodek).compareTo(szukanyObiekt) < 0) {
                    lewo = srodek + 1;
                } else {
                    prawo = srodek - 1;
                }
            }
        }
            return -1;
    }
    public static <T extends Comparable<? super T>>void selectionSort(ArrayList<T> tab) {
        int min;
        for (int i = 0; i < tab.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < tab.size(); j++)
                if (tab.get(j).compareTo(tab.get(min)) < 0)
                    min = j;
            T temp = tab.get(i);
            tab.set(i, tab.get(min));
            tab.set(min, temp);
        }
    }
}
