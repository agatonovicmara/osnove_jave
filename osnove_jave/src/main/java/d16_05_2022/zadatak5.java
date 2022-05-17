package d16_05_2022;

public class zadatak5 {
    public static void main(String[] args) {
//        Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//        Napomena: Resiti bez koriscenja petlji.

            int m = 30;
            int n = 35;
            int rezultat = izbroj(m, n);
        System.out.println(rezultat);

    }
    static int izbroj(int a, int b){
      int count = (b-a)-1;
      return count;   // zadatak radi samo ukoliko unesemo kao 1 vrednost manju a kao 2 vrednost vecu.
    };



}
