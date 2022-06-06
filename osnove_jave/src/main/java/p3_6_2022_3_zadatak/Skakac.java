package p3_6_2022_3_zadatak;

public class Skakac extends Atleticar {

    public Skakac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean bolji(Atleticar a) {
        boolean bolji = false;
        if (this.rezultat > a.getRezultat()) {
            bolji = true;
        } else bolji = false;
        return bolji;
    }


}
