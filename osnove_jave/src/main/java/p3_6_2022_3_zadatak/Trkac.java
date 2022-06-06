package p3_6_2022_3_zadatak;

public class Trkac extends Atleticar {

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean bolji(Atleticar a) {
        boolean bolji = true;
        if (this.rezultat < a.getRezultat()) {
            bolji = true;
        } else bolji = false;
        return bolji;
    }


}
