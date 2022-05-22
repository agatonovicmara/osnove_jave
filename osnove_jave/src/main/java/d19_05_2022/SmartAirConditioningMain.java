package d19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.marka = "Samsung";
        samsung.temperatura = 17;
        samsung.mode = "hladi";
        samsung.potrosnjaHladjenje = 1;
        samsung.potrosnjaGrejanje = 2;

        samsung.stampa();

        int mesecnaPotrosnjaKWh = samsung.mesecnaPotrosnja();
        System.out.println("Mesecna potrosnja klime u kW/h kada hladi: " + mesecnaPotrosnjaKWh + " kW/h.");

        int potrosnjaKlimeUNovcu = samsung.potrosnjaNovca(mesecnaPotrosnjaKWh);
        System.out.println("Klima trosi mesecno kada hladi: " + potrosnjaKlimeUNovcu + " dinara.");
    }
}
