package pl.filipjd.gieryk;

import java.time.LocalDate;
import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski",new String[]{"Jan","Jakub"},LocalDate.of(1992,2,2),true, 50000,LocalDate.of(2019,5,7));
        ludzie[1] = new Student("Nowak",new String[]{"Małgorzata"},LocalDate.of(2000,2,1),false,"informatyka",4.0);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.print(p.getNazwisko() + " ");
            for(String i:p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(", Data ur. " + p.getDataUrodzenia()+ " plec: ");
            if(p.getPlec()){
                System.out.println("mezczyzna");
            }
            else{
                System.out.println("kobieta");
            }
            System.out.println(p.getOpis());
            }
        }
    }


