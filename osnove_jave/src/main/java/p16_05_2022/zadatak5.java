package p16_05_2022;

public class zadatak5 {
    public static void main(String[] args) {
        int b = 250;
        stampajApsolutnuVrednost(b);
    }
    static void stampajApsolutnuVrednost(int a){
        if (a<0){
            a=a*-1;

        }else {
            a=a;
        }
        System.out.println("Apsolutna vrednost je: " + a);
    }
}
