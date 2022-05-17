package p16_05_2022;

public class zadatak8 {
    public static void main(String[] args) {
//        Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//        Trougao je pravougli ukoliko je a*a+b*b=c*c

        boolean trougao = daLiJePravougaoni(4,6, 8);
        System.out.println(trougao);

    }
    static boolean daLiJePravougaoni(int a, int b, int c){
        if (a*a+b*b==c*c){
            return true;
        }else{return false;}
    }
}
