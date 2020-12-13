package pl.imiajd.Gieryk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {
        ArrayList grupa = new ArrayList();
        Osoba osoba1=new Osoba("Gieryk", LocalDate.of(2000,2,14));
        Osoba osoba2=new Osoba("Kowalski", LocalDate.of(2000,2,14));
        Osoba osoba3=new Osoba("Gieryk", LocalDate.of(1999,1,21));
        Osoba osoba4=new Osoba("Kale", LocalDate.of(2001,1,1));
        Osoba osoba5=new Osoba("Nowak", LocalDate.of(1996,6,4));

        grupa.add(osoba1);
        grupa.add(osoba2);
        grupa.add(osoba3);
        grupa.add(osoba4);
        grupa.add(osoba5);
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
