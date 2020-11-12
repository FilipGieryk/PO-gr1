package pl.filipjd.gieryk;

import java.time.LocalDate;

class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
    public void dzwiek(){
        System.out.println("♪♪♪Fortepian");
    }
}

