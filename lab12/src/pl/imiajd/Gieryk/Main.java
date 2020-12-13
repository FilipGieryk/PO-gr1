package pl.imiajd.Gieryk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import static java.lang.StrictMath.sqrt;

public class Main {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        for(int i=n-1;i< pracownicy.size();i+=n-1) {
            pracownicy.remove(i);
        }
    }
    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> temp = new LinkedList<>();
        for(int i=lista.size()-1;i>=0;i--){
            temp.add(lista.get(i));
        }
        lista.clear();
        for(int i=0;i<temp.size();i++){
            lista.add(temp.get(i));
        }
    }
    public static String poKropce(String str) {
        Stack stack = new Stack<>();
        String tmp = "";
        String[] arr = str.split(" ");
        str = "";
        for (String s : arr) {
            stack.push(s);
            if (s.endsWith(".")) {
                while(!stack.empty()) {
                    tmp+=stack.pop()+" ";
                }
                tmp=tmp.replace(".","");
                tmp=tmp.toLowerCase();
                tmp=Character.toUpperCase(tmp.charAt(0))+tmp.substring(1);
                str+=tmp+".";
                tmp="";
            }
            str=str.replace(" .",". ");
        }
        return str;
    }
    public static void liczby(int n){
        Stack stack=new Stack();
        int liczba;
        while(n>0){
            liczba=n%10;
            n=n/10;
            stack.push(liczba);
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    public static void sit(int n) {
        ArrayList<Integer> pierwsze = new ArrayList();
        for (int i = 2; i <= n; i++) {
            pierwsze.add(i);
        }
        int l = 2;
        while (l < sqrt(n)) {
            for (int i = 1; i < pierwsze.size(); i++) {
                if (pierwsze.get(i) % l == 0 && pierwsze.get(i)/l!=1) {
                    pierwsze.remove(i);
                }
            }
            l++;
        }
        System.out.println(pierwsze);
    }
    public static <T> void print(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        String str= "Alicja w krainie. Kraina Czarow.";
        System.out.println(poKropce(str));
        liczby(3514);
        sit(53);
        print("sdsat");
        print(5345);
        print(545.234);
        LinkedList<String> listaPracownikow = new LinkedList<>();
        listaPracownikow.add("Gieryk");
        listaPracownikow.add("Kowalski");
        listaPracownikow.add("Nowak");
        listaPracownikow.add("Kowal");
        listaPracownikow.add("Perl");
        System.out.println(listaPracownikow);
        redukuj(listaPracownikow,2);
        System.out.println(listaPracownikow);
        odwroc(listaPracownikow);
        System.out.println(listaPracownikow);

    }
}
