package pl.edu.uwm.wmii.gierykfilip.laboratorium02;

import java.util.Scanner;

public class Zadanie3 {


    public void macierz(int[][] tab,int col,int row) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tab[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void mnozenie(int[][] pierwsza,int[][]druga){

    }


    public void macierze() {
        Scanner skan = new Scanner(System.in);
        int m = skan.nextInt();
        int n = skan.nextInt();
        int k = skan.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
        macierz(a, m, n);
        macierz(b, n, k);
        int[][] c = new int[n][n];
        int suma;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma=0;
                for(int l=0;l<n;l++){
                    suma+=(a[i][l]*b[j][l]);
                }
                c[i][j]=suma;
            }
        }
        macierz(c,n,n);
    }
}