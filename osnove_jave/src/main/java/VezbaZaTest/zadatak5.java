package VezbaZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        //Napisati program koji ucitava sa tastature N karaktera i kreira niz
        // koji predstavlja palindrom.Na kraju programa odstampati novo kreirani niz.
//        Primer izvrsenja:
//        Unesite N: 4
//        Unesite karakter: M
//        Unesite karakter: b
//        Unesite karakter: n
//        Unesite karakter: c
//        Palindrom:
//        M, b, n, c, c, n, b, M
//        Napomena: U memoriji niz treba da ima sve ove elemente.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = s.nextInt();

        ArrayList <String>palindrom=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite element: ");
            String element = s.next();
            palindrom.add(element);
        }
        //System.out.println(palindrom);


        System.out.println("Niz je: ");
        for (int i = 0; i < palindrom.size(); i++) {
            System.out.print(palindrom.get(i) + ", ");
        }


        for (int i = palindrom.size() - 1; i >= 0; i--) {
           System.out.print(palindrom.get(i) + ", ");
       }



        }
}
