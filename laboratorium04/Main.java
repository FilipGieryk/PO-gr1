package pl.edu.uwm.wmii.gierykfilip.laboratorium04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(4);
        myNumbers.add(10);
        myNumbers.add(12);
        myNumbers.add(20);
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(5);
        myNumbers2.add(11);
        myNumbers2.add(24);
        myNumbers2.add(90);
        myNumbers2.add(96);
        System.out.println(Zadanie1.append(myNumbers,myNumbers2));
        System.out.println(Zadanie2.merge(myNumbers,myNumbers2));
        System.out.println(Zadanie3.mergeSorted(myNumbers,myNumbers2));
        System.out.println(Zadanie4.reversed(myNumbers));
        Zadanie5.reverse(myNumbers);
        System.out.println(myNumbers);
    }
}
