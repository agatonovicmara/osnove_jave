package p3_6_2022_zadatak1;

public class IcePoint extends Proizvod {
    private String tipSladoleda;
    private boolean maliIliVeliki;

    public IcePoint(String tipSladoleda, boolean maliIliVeliki) {
        this.tipSladoleda = tipSladoleda;
        this.maliIliVeliki = maliIliVeliki;
    }

    public IcePoint() {
    }

    @Override
    public int ukupnaCena() {
        int ukupnaCena = 0;
        if (this.maliIliVeliki = false) {
            ukupnaCena = cenaDodataka() + 100;
        } else {
            ukupnaCena = cenaDodataka() + 130;
        }
        return ukupnaCena;
    }

    @Override
    public void print() {

        System.out.print("Velicina sladoleda: ");
        if (this.maliIliVeliki == false) {
            System.out.println(" mali");
        } else {
            System.out.println(" veliki.");
        }
        System.out.println("Tip sladoleda: " + this.tipSladoleda);
        System.out.print("Dodatak: ");
        for (int i = 0; i < dodaci.size(); i++) {
            System.out.print(dodaci.get(i).getNaziv() + ", ");
        }
        System.out.println("Ukupna cena: "+ukupnaCena()+ " din.");
        System.out.println();


    }


}
