package d2_6_2022;

public class Magacioner extends Radnik{

    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlata(){
        double prosecnaPlata=0;
        double suma=0;
        for (int i = 0; i < nizSektora.size(); i++) {
            double p = nizSektora.get(i).getPlata();
            suma += suma+p;

        }prosecnaPlata=suma/ nizSektora.size()*0.5;
        return prosecnaPlata;
    }
    @Override
    public double plata(){
        double plata = this.prosecnaPlata() * nizSektora.size();
        return plata;
    }



}
