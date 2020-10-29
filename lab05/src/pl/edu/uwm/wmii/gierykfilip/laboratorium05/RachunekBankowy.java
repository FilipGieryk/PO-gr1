package pl.edu.uwm.wmii.gierykfilip.laboratorium05;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double a){
        this.saldo=a;
    }
    public void obliczMiesieczneOdsetki(){
        this.saldo+=(this.saldo*this.rocznaStopaProcentowa)/12;
    }
    public static void setRocznaStopaProcentowa(double a){
        rocznaStopaProcentowa=a;
    }
    public double podajSaldo(){
        return saldo;
    }
}
