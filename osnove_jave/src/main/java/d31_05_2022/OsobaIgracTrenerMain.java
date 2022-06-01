package d31_05_2022;

public class OsobaIgracTrenerMain {
    public static void main(String[] args) {

        Igrac marko = new Igrac("Marko J.", "11234567",1998, 9, "napadac", false);
        Igrac sasa = new Igrac("Sasa Devic", "887236",1999, 7, "napadac", false);

        Trener prvi = new Trener("Ivana Savic", "8970874", 1986, 4, "pomocni");
        Trener drugi = new Trener("Jelena Jelic", "87698", 1978, 17, "glavni");

        sasa.print();
        System.out.println();
        marko.print();
        System.out.println();
        prvi.print();
        System.out.println();
        drugi.print();
    }
}
