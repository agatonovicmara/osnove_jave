package p2_6_2022_Figure;

public class JednakostranicniTrougao extends Figura {

    public int stranicaA;

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public JednakostranicniTrougao() {
    }

    @Override
    public double povrsina() {
        double povrsina = (stranicaA * stranicaA) * 1.73205 / 4;
        return povrsina;
    }

    @Override
    public double obim() {
        double obim = stranicaA + stranicaA + stranicaA;
        return obim;
    }
}
