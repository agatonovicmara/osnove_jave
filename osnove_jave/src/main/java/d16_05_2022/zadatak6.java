package d16_05_2022;

public class zadatak6 {
    public static void main(String[] args) {
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        int x = 490;
        int y = 789;
        int g = 74;

        int najmanji = najmanjiOdTriBroja(x, y, g);
        System.out.print(najmanji);

    }

    static int najmanjiOdTriBroja(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
