package p3_6_2022_zadatak2;

public class Lokal extends Objekat{

    public Lokal(String adresa, int povrsina, int zona) {
        super(adresa, povrsina, zona);
    }


    @Override
    public double porez() {
        return koeficijent()*povrsina*1.3;
    }

    @Override
    public void print() {
        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina: "+this.povrsina);
        System.out.println("Porez: "+porez());
    }
}
