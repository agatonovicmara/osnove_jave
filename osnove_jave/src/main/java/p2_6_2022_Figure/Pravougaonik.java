package p2_6_2022_Figure;

public class Pravougaonik extends Figura {

    public int stranicaA;
    public int stranicaB;

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        double povrsina = stranicaA * stranicaB;
        return povrsina;
    }

    @Override
    public double obim() {
        double obim = 2 * stranicaA + 2 * stranicaB;
        return obim;
    }

}
