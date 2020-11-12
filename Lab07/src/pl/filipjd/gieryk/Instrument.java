package pl.filipjd.gieryk;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {
    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent=producent;
        this.rokProdukcji = rokProdukcji;
    }
    public String getProducent(){
        return producent;
    }
    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }
    abstract public void dzwiek();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) &&
                Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return  "producent='" + producent + '\'' +
                " rokProdukcji=" + rokProdukcji +
                '}';
    }

    private String producent;
    private LocalDate rokProdukcji;
}

