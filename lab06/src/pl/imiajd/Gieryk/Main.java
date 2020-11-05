package pl.imiajd.Gieryk;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gieryk",2000,"ISI");
        Nauczyciel nauczyciel1 = new Nauczyciel("Kowalski",1987,7600);

        System.out.println(nauczyciel1);
        System.out.println(student1);
        System.out.println(nauczyciel1.getpensja());
        System.out.println(student1.getKierunek());

        BetterRectangle rect = new BetterRectangle(4,6,7,4);
        System.out.println("obwod " + rect.getPerimeter());
        System.out.println("pole " + rect.getArea());
    }
}
