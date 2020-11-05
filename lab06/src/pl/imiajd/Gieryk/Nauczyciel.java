package pl.imiajd.Gieryk;

public class Nauczyciel extends Osoba {
    private int pensja;
    public Nauczyciel (String nazwisko,int rokUrodzenia, int pensja)
    {
        super(nazwisko,rokUrodzenia);
        this.pensja = pensja;
    }
    public int getpensja(){
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() + ", pensja " + this.pensja;

    }
}
