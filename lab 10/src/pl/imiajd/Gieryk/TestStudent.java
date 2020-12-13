package pl.imiajd.Gieryk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Gieryk", LocalDate.of(2000, 2, 14), 4.5);
        Student student2 = new Student("Kowalski", LocalDate.of(2000, 2, 14), 2.5);
        Student student3 = new Student("Gieryk", LocalDate.of(2000, 2, 14), 3.5);
        Student student4 = new Student("Kale", LocalDate.of(2001, 1, 1), 2.5);
        Student student5 = new Student("Nowak", LocalDate.of(1996, 6, 4), 2.0);
        ArrayList grupa = new ArrayList();
        grupa.add(student1);
        grupa.add(student2);
        grupa.add(student3);
        grupa.add(student4);
        grupa.add(student5);

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
