package VezbaZaTest;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();
        System.out.println("Unesite tezinu osobe (kg): ");
        double tezina = s.nextDouble();

        double bmi = tezina / (visina * visina);

        String kategorija = "";

        if (bmi<18.5) {
            kategorija = "Neuhranjenost";
        }else if(bmi>18.5 && bmi<24.99){
            kategorija = "Normalna tezina";
        }else if(bmi<25 && bmi>29.99){
            kategorija = "Prekomerna tezina";
        }else if (bmi>30){
            kategorija="Gojaznost";
        }

        System.out.print("Kategorija je: " + kategorija + ".");

    }
}
