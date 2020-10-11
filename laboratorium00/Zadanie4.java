package pl.edu.uwm.wmii.gierykfilip.laboratorium00;

  class Zadanie4 {
        public Zadanie4(){
            int saldo = 1000;
            int i;
            for(i=0;i<=3;i++){
                saldo+=saldo*0.06;
                System.out.println(saldo);
        }
    }
}
