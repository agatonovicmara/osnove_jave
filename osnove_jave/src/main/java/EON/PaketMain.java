package EON;

public class PaketMain {
    public static void main(String[] args) {
       Paket p = new Paket();
       EONPaket eon = new EONPaket("EON LIGHT DUO", "Marija M.",
               2000, 12, 150, 75 );

       DUOPaket duo = new DUOPaket("EON FULL DUO", "Dejan M.",
               3000, 24, 250, 100, "Laptop" );

        duo.print();
        System.out.println();
        eon.print();

    }
}
