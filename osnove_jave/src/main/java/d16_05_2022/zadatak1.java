package d16_05_2022;

public class zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu stampajVrednostZa10Vecu
//        u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        int inicijelnaVrednost = 20;
        stampajVrednostZa10Vecu(inicijelnaVrednost);
        stampajVrednostZa10Vecu(40);
        stampajVrednostZa10Vecu(-30);

    }

    static void stampajVrednostZa10Vecu (int c){
        c = c+10;
        System.out.println("Vrednost je: " + c);
    }
}
