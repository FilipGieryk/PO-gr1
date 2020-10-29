package pl.edu.uwm.wmii.gierykfilip.laboratorium05;

public class Main {

    public static void main(String[] args) {
        RachunekBankowy saver1=new RachunekBankowy(2000.00);
        RachunekBankowy saver2=new RachunekBankowy(3000.00);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("nowe saldo saver 1 1 miesiac : " + saver1.podajSaldo() + " nowe saldo saver2 1 miesiac: " + saver2.podajSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("nowe saldo saver 1 2 miesiac : " + saver1.podajSaldo() + " nowe saldo saver2 2 miesiac: " + saver2.podajSaldo());
        IntegerSet zbior1=new IntegerSet();
        IntegerSet zbior2=new IntegerSet();
        zbior1.insertElement(56);
        zbior1.insertElement(3);
        zbior2.insertElement(32);
        zbior2.insertElement(12);
        zbior2.insertElement(3);
        zbior2.insertElement(55);
        zbior2.deleteElement(55);
        System.out.println("union " + IntegerSet.union(zbior1,zbior2));
        System.out.println("intersection " + IntegerSet.intersection(zbior1,zbior2));
        System.out.println("string " + zbior1.toString());
        System.out.println("equals " + zbior1.equals(zbior2));
        System.out.println(zbior1);

    }
}
