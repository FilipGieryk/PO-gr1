package pl.filipjd.gieryk;

import java.time.LocalDate;

class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
    public void dzwiek(){
        System.out.println("♪♪♪Skrzypce");
    }
}
