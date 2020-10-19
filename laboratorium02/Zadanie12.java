package pl.edu.uwm.wmii.gierykfilip.laboratorium02;

public class Zadanie12 {

    public void tablica(int[] tab){
        for(int i=0;i<tab.length;i++){
            System.out.println(i+" : "+tab[i]);
        }
    }


    public void zad1(int[] tab) {
        int parz = 0;
        int nieparz=0;
        for (int i = 0; i <tab.length; i++) {
            if (tab[i]%2==0) {
                parz++;
            }
            else{
                nieparz++;
            }
        }
        System.out.println("parzyste: "+parz+" nieparzyste: " +nieparz);
    }

    public void zad2(int[] tab){
        int zero=0;
        int dodatnie=0;
        int ujemne = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0){
                dodatnie++;
            }
            if(tab[i]<0){
                ujemne++;
            }
            if(tab[i]==0){
                zero++;
            }
        }
        System.out.println("w tabeli jest "+dodatnie+" liczb dodtanich, "+ujemne+" liczby ujemnych i " +zero+ " zer");
    }

    public void zad3(int[] tab){
        int max=tab[0];
        int count=0;
        for(int i=0;i<tab.length;i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        for(int i=0;i<tab.length;i++){
            if(tab[i]==max){
                count++;
            }
        }
        System.out.println("max number = "+max+" counted " +count+ " times");
    }
    public void zad4 (int[] tab){
        int sumadod=0;
        int sumauj=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0){
                sumadod+=tab[i];
            }
            if(tab[i]<0){
                sumauj+=tab[i];
            }
        }
        System.out.println("sum of positive numbers: " + sumadod+ " sum of negative nubmers: "+ sumauj);
    }

    public void zad5 (int[] tab){
        int count=0;
        int max=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0){
                count++;
            }
            if(tab[i]<0 | i==tab.length-1){
                if(count>max) {
                    max = count;
                    count = 0;
                }
            }
        }
        System.out.println("biggest streak: " +max);
    }

    public void zad6(int[] tab){
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0){
                tab[i]=1;
            }
            else{
                tab[i]=-1;
            }
        }
        tablica(tab);
    }

}
