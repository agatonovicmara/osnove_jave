package VezbaZaTest;

public class zadatakKonverzijaValute {
    public static void main(String[] args) {
//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
//        konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
//        izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//        U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.2113 RSD
//        1 EUR = 1.1821 USD

        double result = konverter(3, "USD");
        System.out.println(result);
        result = konverter(3, "RSD");
        System.out.println(result);

    }

    static double konverter(double euri, String valuta) {
        double vrednost = 0;
        if (valuta == "USD") {
            vrednost = euri * 1.1821;
        } else if (valuta == "RSD") {
            vrednost = euri * 117.2113;
        } else if (valuta == "RUB") {
            vrednost = euri * 89.2323;
        }
        return vrednost;


    }

}





