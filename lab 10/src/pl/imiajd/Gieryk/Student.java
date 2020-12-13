package pl.imiajd.Gieryk;


import java.time.LocalDate;

public class Student extends Osoba implements Cloneable,Comparable<Osoba>{
    private double sredniaOcen;
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    @Override
    public String toString() {
        return super.toString() + getClass().getSimpleName() +
                "sredniaOcen=" + sredniaOcen +
                ']';
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        double avg=((Student)o).sredniaOcen;
        if(result==0){
            if(sredniaOcen>avg){
                return 0;
            }
            if(sredniaOcen<avg){
                return 1;
            }
        }
        return result;
    }
}
