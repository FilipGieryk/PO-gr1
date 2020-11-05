package pl.imiajd.Gieryk;

public class Adres {
    private String ulica;
    private int nr_domu;
    private int nr_mieszkania;
    private String miasto;
    private int kod_pocztowy;
    Adres(String ulica,int nr_domu,int nr_mieszkania, String miasto, int kod_pocztowy){
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.nr_mieszkania= nr_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    Adres(String ulica,int nr_domu, String miast, int kod_pocztowy){
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        if (this.nr_mieszkania != -1){
            System.out.printf("%s %d %d\n", this.ulica, this.nr_domu, this.nr_mieszkania);
        }
        else{
            System.out.printf("%s %d\n", this.ulica,this.nr_domu);
        }
    }
    public boolean przed(int kodPocztowy){
        return this.kod_pocztowy<kodPocztowy;
    }
}
