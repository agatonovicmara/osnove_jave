package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning samsung = new SmartAirConditioning();

        samsung.marka="Samsung";
        samsung.temperatura=25;
        samsung.mode="hladi";

        samsung.stampa();

        System.out.println();

        SmartAirConditioning beko = new SmartAirConditioning();

        beko.marka="Beko";
        beko.temperatura=16;
        beko.mode="hladi";

        beko.stampa();
    }
}
