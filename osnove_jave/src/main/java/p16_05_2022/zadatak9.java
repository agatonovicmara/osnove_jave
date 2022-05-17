package p16_05_2022;

public class zadatak9 {
    public static void main(String[] args) {

//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//                Ako se unese VIII vraca se 8.
//        VIII => 8

        String rimski = "X";

        int arapski = konverzijaBrojeva("VIII");
        System.out.println(arapski);

    }
    static int konverzijaBrojeva(String a){
        int p=0;
        if (a.equals("I")){
            p=1;        }
        if (a.equals("II")){
            p=2;
        }if (a.equals("III")){
            p=3;
        }if (a.equals("IV")){
            p=4;
        }if (a.equals("V")){
            p=5;
        }if (a.equals("VI")){
            p=6;
        }if (a.equals("VII")){
            p=7;
        }if (a.equals("VIII")){
            p=8;
        }if (a.equals("IX")){
            p=9;
        }if (a.equals("X")){
            p=10;
        }
        return p;


    }
}
