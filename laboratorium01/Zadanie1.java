package pl.edu.uwm.wmii.gierykfilip.laboratorium01;

import java.util.Scanner;

import java.lang.Math;


public class Zadanie1 {
    Scanner scan = new Scanner(System.in);
    int n;
    int wynik;

    public void podajN(){
        System.out.println("Podaj ile lcizb chcesz użyć");
        n=scan.nextInt();
    }
    public void a(){
        podajN();
        wynik=0;
        for(int i=0;i<n;i++){
            System.out.println("Podaj kolejną liczbę");
            wynik+=scan.nextDouble();
        }
        System.out.println("wynik to " + wynik);
    }
    public void b(){
        podajN();
        wynik=1;
        for(int i=0;i<n;i++){
            System.out.println("Podaj kolejną liczbę");
            wynik*=scan.nextDouble();
        }
        System.out.println("wynik to " + wynik);
    }
    public void c() {
        podajN();
        wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            wynik += Math.abs(scan.nextDouble());
        }
        System.out.println("wynik to " + wynik);
    }
    public void d() {
        podajN();
        wynik=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            wynik += Math.sqrt(Math.abs(scan.nextDouble()));
        }
        System.out.println("wynik to " + wynik);
    }
    public void e() {
        podajN();
        wynik=1;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            wynik *= Math.abs(scan.nextDouble());
        }
        System.out.println("wynik to " + wynik);
    }
    public void g() {
        podajN();
        wynik=0;
        double wynik2=1;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj kolejną liczbę");
            double a=scan.nextDouble();
            wynik +=a;
            wynik2 *=a;
        }
        System.out.println("wynik 1 to " + wynik);
        System.out.println("wynik 2 to " + wynik2);
    }
//
    public void h(){
        podajN();
        wynik=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Podaj kolejną liczbę");
            double a= scan.nextDouble();
            wynik+=Math.pow(-1,i+1)*a;
        }
        System.out.println("wynik to " + wynik);
    }
    public int factorial(int t) {
        int silnia = 1;
        for (int i = 1; i <= t; i++) {
            silnia *= i;
        }
        return silnia;
    }

    public void i() {
        podajN();
        wynik=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Podaj kolejną liczbę");
            double a = scan.nextDouble();
            wynik+=(Math.pow(-1,i)*a)/factorial(i);
        }
        System.out.println("wynik to " + wynik);
    }
}
