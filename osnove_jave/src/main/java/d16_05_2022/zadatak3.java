package d16_05_2022;

public class zadatak3 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja
//        i da li je aktivan kao parametre metode.

        String jmbg = "110698567788990";
        String ime = "Marija";
        String prezime = "Mitrovic";
        int kadSiRodjen = 1985;
        boolean daLiSiAktivan = false;

        podaciOKorisniku(jmbg, ime, prezime, kadSiRodjen, daLiSiAktivan);

    }

    static void podaciOKorisniku(String JMBG, String ime, String prezime,
                                 int godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
