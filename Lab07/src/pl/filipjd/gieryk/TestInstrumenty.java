package pl.filipjd.gieryk;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Yamaha", LocalDate.of(2018,1,1)));
        orkiestra.add(new Fortepian("Casio", LocalDate.of(2004,1,1)));
        orkiestra.add(new Skrzypce("Yamaha", LocalDate.of(2020,1,1)));
        orkiestra.add(new Flet("Hohner",LocalDate.of(2009,1,1)));
        orkiestra.add(new Skrzypce("Harald Lorenz",LocalDate.of(2015,1,1)));
        for(Instrument i:orkiestra){
            i.dzwiek();
        }
        for(Instrument i: orkiestra){
            System.out.println(i);
        }
    }
}
