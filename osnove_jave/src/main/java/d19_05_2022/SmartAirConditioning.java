package d19_05_2022;

public class SmartAirConditioning {

//    metodu koja racuna koliko klima novca potrosi za mesec dana
//    Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//    Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//    Metoda vraca ukupnu cenu za taj mesec
//
//    U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

    public String marka;
    public int potrosnjaHladjenje;
    public int potrosnjaGrejanje;
    public int temperatura;
    public String mode;

    public SmartAirConditioning() {
    }

    public void stampa() {
        System.out.println("Marka: " + this.marka + "; mod: " + this.mode +
                " ; temperatura: " + this.temperatura + " stepeni C");
    }
    public int mesecnaPotrosnja() {
        int potrosnjaKWh = 0;
        if (this.mode.equals("hladi")) {
            potrosnjaKWh = 30 * 15 * this.potrosnjaHladjenje;
        }
        if (this.mode.equals("greje")) {
            potrosnjaKWh = 30 * 15 * this.potrosnjaGrejanje;
        }
        return potrosnjaKWh;
    }
    public int potrosnjaNovca(int potrosnjakWh) {
        int ukupnaCena = 0;
        if (potrosnjakWh > 0 && potrosnjakWh <= 350) {
            ukupnaCena = potrosnjakWh * 6;
        } else if (potrosnjakWh > 350) {
            ukupnaCena = potrosnjakWh * 9;
        } return ukupnaCena;
    }


}


