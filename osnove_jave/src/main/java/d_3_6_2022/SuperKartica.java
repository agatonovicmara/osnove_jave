package d_3_6_2022;

public class SuperKartica {

    private String brKartice;
    private String vlasnik;
    private int popust;

    public SuperKartica(String brKartice, String vlasnik, int popust) {
        this.brKartice = brKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(String brKartice) {
        this.brKartice = brKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void print() {
        System.out.println(this.brKartice + ", " + this.vlasnik);
    }
}
