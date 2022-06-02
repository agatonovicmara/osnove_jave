package p2_6_2022_Figure;

public abstract class Figura {

    protected abstract double povrsina();

    protected abstract double obim();

    public void print() {
        System.out.println("Povrsina je: " + povrsina());
        System.out.println("Obim je: " + obim());
    }


}
