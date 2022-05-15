package d13_05_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji uci korisnika da kaze “Molim te”.
//        Program od korisnika ucitava zahteve koje treba da izvrsi
//        ali jedino reaguje ukoliko korisnik lepo zamoli
//        ( u zahtevu unese “Molim te”).
//        Ukoliko korisnik unese zahtev u vidu naredjivanja,
//        program ne reaguje na takve zahteve tj. nista ne ispisuje,
//        a ukoliko korisnik zamoli tada program ispisuje “Dogovoreno!”.
//        Program radi dok korisnik ne unese “Hvala!”.
//        Na kraju programa ispisati “Cao”
//        Commitujte zadatak i push-ujte na github, sa porukom
//        “Domaci 13.05.2022 Zadatak 4”.
//        Za ovaj zadatak trebace vam nextLine metoda sa scannerom.


        Scanner s = new Scanner(System.in);

        String zahtev = "";

        System.out.println("Unesite zahtev, ali lepo zamolite: ");
        zahtev = s.nextLine();


        while (true) {
            System.out.println("Unesite zahtev, ali lepo zamolite: ");
            zahtev = s.nextLine();

            if (zahtev.contains("molim te")) {
                System.out.println("Dogovoreno!");
                //break;
            }

            if (zahtev.contains("molim te") == false && zahtev.contains("hvala") == false) {
                System.out.println("Unesite zahtev, ali lepo zamolite: ");
                zahtev = s.nextLine();
            }

            if (zahtev.contains("hvala")) {
                System.out.println("Cao!");
                break;
            }


        }
    }


}






