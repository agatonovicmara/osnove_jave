package d16_05_2022;

public class zadatak2 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja
//        koja su ulazni parametri funkcije
//        vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int x = 3;
        int y = 9;

        String k = novaVrednost(x, y);
        System.out.println(k);

    }

    static String novaVrednost(int a, int b) {
        String c = (a + "" + b);
        return c;
    }
}
