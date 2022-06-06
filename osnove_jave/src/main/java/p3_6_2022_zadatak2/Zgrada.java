package p3_6_2022_zadatak2;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adresa, int povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }


    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return koeficijent()*povrsina*this.brojStanova;

    }

    @Override
    public void print() {
        System.out.println("Adresa: "+this.adresa);
        System.out.println("Povrsina: "+this.povrsina);
        System.out.println("Zona: "+this.zona);
        System.out.println("Broj stanova: "+this.brojStanova);
        System.out.println("Porez: "+porez());

    }
}
