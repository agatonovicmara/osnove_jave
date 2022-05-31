package d30_05_2022;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public Student(int brojIndeksa,
                   String punoIme,
                   String tipStudija,
                   ArrayList<Ispit> ispiti) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = ispiti;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit(Ispit ispiti) {
        this.ispiti.add(ispiti);
    }

    public double prosecnaOcena(){
        double avg=0;
        double suma=0;
        for (int i = 0; i < ispiti.size(); i++) {
        suma=suma+this.ispiti.get(i).getOcena();
        }
        return avg=suma/ispiti.size();
    }


        public void print(){
            System.out.println(this.brojIndeksa + " - "+ this.punoIme+" - "+ this.tipStudija);
            System.out.println("Predmeti: ");
            for (int i = 0; i < ispiti.size(); i++) {
                System.out.print(this.ispiti.get(i).getPredmet() + " - ");
                System.out.print(this.ispiti.get(i).getProfesor()+ " - ");
                System.out.print(this.ispiti.get(i).getOcena()+ ". ");
                System.out.println();
            }
            System.out.println("Prosecna ocena: "+prosecnaOcena());
        }
}

