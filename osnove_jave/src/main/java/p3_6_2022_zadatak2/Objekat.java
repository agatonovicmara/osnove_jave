package p3_6_2022_zadatak2;

public abstract class Objekat {
    protected String adresa;
    protected int povrsina;
    protected int zona;

    public Objekat(String adresa, int povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public Objekat() {
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(int povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent(){
        double koeficijent=0;
        if(this.zona==1){
            koeficijent=1.4;
        }if (this.zona==2){
            koeficijent=1.1;
        }if (this.zona==3){
            koeficijent=1.05;
        }return koeficijent;
    }
    public abstract double porez();
    public abstract void print();
}
