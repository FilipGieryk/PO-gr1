package pl.imiajd.Gieryk;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable,Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        Osoba osoba = (Osoba) o;
        return nazwisko.equals(osoba.nazwisko) &&
                dataUrodzenia.equals(osoba.dataUrodzenia);
    }


    @Override
    public int compareTo(Osoba o) {
        int result = nazwisko.compareTo(o.nazwisko);
        if(result==0){
            return dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return result;
    }
}
