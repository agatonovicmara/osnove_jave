package p16_05_2022;

public class zadatak6 {
    public static void main(String[] args) {

//        Napisati metodu koja stampa N zvezdica u istom redu.
//        Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5,
//        metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9,
//        metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *

        int n = 8;
        brojZvezdica(n);
    }

    static void brojZvezdica(int b){
        for (int i = 0; i <= b; i++) {
            System.out.print("* ");

        }
        System.out.println();
    }
}
