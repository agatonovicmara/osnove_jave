package p16_05_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//        za dva prosledjena broja. Brojevi su ulazni parametri funkcije. //
//        U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.

        Scanner s = new Scanner(System.in);
        System.out.println("unesite x: ");
        int x = s.nextInt();
        System.out.println("Unesite y: ");
        int y = s.nextInt();

                operacija(x,y);

    }
    static void operacija (int a, int b){
        int zbir= a+b;
        int razlika = a-b;
        int proizvod = a*b;
        double kolicnik = a/b;
        System.out.println("Zbir je: " + zbir);
        System.out.println("Razlika je: " + razlika);
        System.out.println("Proizvod je: " + proizvod);
        System.out.println("Kolicnik je: " + kolicnik);
    }
}
