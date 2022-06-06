package p3_6_2022_zadatak2;

import java.util.ArrayList;

public class PoreskaUprava {

    private String imeGrada;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    private ArrayList<Objekat>objekti=new ArrayList<>();

    public void dodajObjekat(Objekat o){
        objekti.add(o);
    }

    public double porezZaCeoGrad(){
        double porezCeoGrad=0;
        for (int i = 0; i < objekti.size(); i++) {
            porezCeoGrad+=objekti.get(i).porez();
        }return porezCeoGrad;

    }
}
