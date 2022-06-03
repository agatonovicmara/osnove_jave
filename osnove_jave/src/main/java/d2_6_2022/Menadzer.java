package d2_6_2022;

public class Menadzer extends Radnik {


    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plata() {
        double suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            double p= nizSektora.get(i).getPlata();
            suma = suma + p;

        } return suma;


    }
}
