package p16_05_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();
       int r = negativnaVrednost(n);
        System.out.println(r);
    }

    static int negativnaVrednost(int p){
                return p*-1;
    }
}
