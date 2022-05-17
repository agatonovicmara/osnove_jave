package p16_05_2022;

public class zadatak3 {
    public static void main(String[] args) {
//        3.Napisati metodu koja stampa zvezdicu sa razmakom.
//        U glavnom programu je potrebno odstampati sledecu sliku:
//          *  *  *  *  *
//          *  *  *  *
//          *  *  *
//          *  *
//          *
//
        for (int i = 0; i < 5; i++) {
            starPrint();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            starPrint();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            starPrint();
        }
        System.out.println(        );
        for (int i = 0; i < 2; i++) {
            starPrint();
        }
        System.out.println();
        starPrint();
    }






    static void starPrint(){
        System.out.print("* ");
    }
}
