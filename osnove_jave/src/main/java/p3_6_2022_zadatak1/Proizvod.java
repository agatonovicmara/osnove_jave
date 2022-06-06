package p3_6_2022_zadatak1;

import java.util.ArrayList;

public abstract class Proizvod {
        ArrayList<Dodatak>dodaci=new ArrayList<Dodatak>();

    public void ubaciDodatak(Dodatak d){
        this.dodaci.add(d);
    }

    public int cenaDodataka() {
            int ukupnaCena = 0;
            for (int i = 0; i < dodaci.size(); i++) {
                ukupnaCena = ukupnaCena+this.dodaci.get(i).getCena();
            }return ukupnaCena;
    }
    public abstract int ukupnaCena();

    public abstract void print();
}
