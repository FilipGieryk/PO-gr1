package pl.imiajd.Gieryk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(6);
        liczby.add(2);
        liczby.add(1);
        liczby.add(7);
        liczby.add(8);
        ArrayList<Integer> liczby2 = new ArrayList<>();
        liczby2.add(1);
        liczby2.add(2);
        liczby2.add(5);
        liczby2.add(6);
        liczby2.add(8);
        ArrayList<LocalDate> data = new ArrayList<>();
        data.add(LocalDate.of(2000,1,3));
        data.add(LocalDate.of(2005,5,2));
        data.add(LocalDate.of(1999,8,6));
        data.add(LocalDate.of(2002,6,4));
        System.out.println(ArrayUtil.isSorted(liczby));
        System.out.println(ArrayUtil.isSorted(liczby2));
        System.out.println(ArrayUtil.binSearch(liczby2,2));
        System.out.println(ArrayUtil.binSearch(data,LocalDate.of(1999,8,6)));
        Collections.sort(data);
        System.out.println(ArrayUtil.binSearch(data,LocalDate.of(1999,8,6)));


    }
}
