package d_3_6_2022;

public class Tetrapak extends Ambalaza {

    private boolean recikliranje;
    private double osnovnaCena;

    public Tetrapak(String barKod, String naziv, double neto,
                    double bruto, boolean recikliranje, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.recikliranje = recikliranje;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean recikliranje, double osnovnaCena) {
        this.recikliranje = recikliranje;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliranje() {
        return recikliranje;
    }

    public void setRecikliranje(boolean recikliranje) {
        this.recikliranje = recikliranje;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = 0;
        if (this.recikliranje == true) {
            cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            cena = osnovnaCena;
        }
        return cena;
    }

    @Override
    public void print() {
        System.out.print("Da li se reciklira ambalaza: ");
        if (this.recikliranje == true) {
            System.out.println("reciklira se.");
        } else {
            System.out.println("ambalaza se ne reciklira.");
        }
        System.out.println("Osnovna cena ambalaze: " + this.osnovnaCena);
        System.out.println("Cena je : " + this.cena());
    }
}
