package pl.edu.uwm.wmii.gierykfilip.laboratorium01;

import java.util.Scanner;

public class Zadanie2 {
    Scanner scan = new Scanner(System.in);
    int n;
    double [] liczby;
    Zadanie1 zad1=new Zadanie1();

    public void podajN() {
        System.out.println("Podaj ile lcizb chcesz użyć");
        n = scan.nextInt();
    }
    public void a() {
        podajN();
        int wynik =0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            int a = scan.nextInt();
            if (a % 2 != 0) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void b() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i] = scan.nextInt();
            if (liczby[i] % 3 == 0 & liczby[i]%5!=0 ) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void c() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i] = scan.nextInt();
            if (Math.sqrt(liczby[i])%2==0) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void d() {
        podajN();
        double[] liczby = new double[n+1];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i] = scan.nextInt();
            if (i > 1 & 1 < n) {
                if (liczby[i] < ((liczby[i - 1] + liczby[i + 1]) / 2)) {
                    wynik++;
                }
            }
        }
        System.out.println(wynik);
    }
    public void e() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (i<=1 & 1<=n &Math.pow(2,i)<liczby[i] & liczby[i]<zad1.factorial(i)) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void f() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (i%2!=0 &liczby[i]%2==0) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void g() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (liczby[i]%2!=0&liczby[i]>0) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void h() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (Math.abs(liczby[i])<Math.pow(i,2)) {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    public void zad2() {
        podajN();
        double[] liczby = new double[n];
        int wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (liczby[i]>0) {
                wynik+=2*liczby[i];
            }
        }
        System.out.println(wynik);
    }
    public void zad3() {
        podajN();
        double[] liczby = new double[n];
        int dodatnie=0;
        int ujemne=0;
        int zera=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]= scan.nextInt();
            if (liczby[i]>0) {
                dodatnie++;
            }
            if(liczby[i]<0){
                ujemne++;
            }
            if(liczby[i]==0){
                zera++;
            }
        }
        System.out.println("dodatnie: " + dodatnie + " ujemne: " + ujemne + " zera: " + zera);
    }
    public void zad4() {
        podajN();
        double[] liczby = new double[n];
        double max = liczby[0];
        double min = liczby[0];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i] = scan.nextInt();
            if (liczby[i] > max) {
                max = liczby[i];
            }
            if (liczby[i] < min) {
                min = liczby[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }
    public void zad5() {
        podajN();
        double[] liczby = new double[n];
        int wynik = 0;
        for (int i = 0; i < n;i++) {
            System.out.println("Podaj kolejną liczbę");
            liczby[i]=scan.nextInt();
            if(i>0) {
                if (liczby[i - 1] > 0 & liczby[i] > 0) {
                    wynik++;
                }
            }
        }
        System.out.println(wynik);
    }
}
