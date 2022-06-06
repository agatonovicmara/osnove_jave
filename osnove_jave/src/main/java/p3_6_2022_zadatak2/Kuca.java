package p3_6_2022_zadatak2;

import java.sql.SQLOutput;

public class Kuca extends Objekat{

    private int brojStanovnika;


    public Kuca(String adresa, int povrsina, int zona, int brojStanovnika) {
        super(adresa, povrsina, zona);
        this.brojStanovnika = brojStanovnika;
    }



    @Override
    public double porez() {
        return koeficijent()*this.povrsina;
    }

    @Override
    public void print() {
        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina: "+this.povrsina);
        System.out.println("Zona: "+this.zona);
        System.out.println("Porez: "+porez());

    }
}
