package d31_05_2022;

public class Trener extends Osoba{

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    private int godineIskustva;
    private String tipTrenera;

    @Override
    public void print(){
        super.print();
        System.out.println("Godine iskustva: "+this.godineIskustva);
        System.out.println("Tip trenera: "+this.tipTrenera);

    }
}
