package pl.filipjd.gieryk;

import java.time.LocalDate;

class Flet extends Instrument {
    public Flet(String producent, LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
    public void dzwiek(){
        System.out.println("♪♪♪Flet");
    }
}
