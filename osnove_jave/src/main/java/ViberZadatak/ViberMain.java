package ViberZadatak;

public class ViberMain {
    public static void main(String[] args) {

        Viberkorisnik posiljalac = new Viberkorisnik("Ana Devic", "064-222", true);
        Viberkorisnik primalac = new Viberkorisnik("Jovana Beric", "065-777", true);


        ViberReakcija reakcija = new ViberReakcija("Heart", posiljalac, primalac);
        ViberReakcija reakcija1 = new ViberReakcija("Sunglasses", primalac, posiljalac);

        ViberPoruka poruka1 = new ViberPoruka("Gde si, mala?", "12:00", posiljalac, primalac, reakcija);
        ViberPoruka poruka2 = new ViberPoruka("Cao, devojcice!", "12:05", posiljalac, primalac, reakcija1);

        poruka1.prikazi();
        System.out.println();
        poruka2.prikazi();

    }
}
