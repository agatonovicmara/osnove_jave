package d30_05_2022;

public class Ispit {
    private String predmet;
    private String profesor;
    private int ocena;

    public Ispit() {
    }

    public Ispit(String predmet, String profesor, int ocena) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozen(int ocena) {
        if (ocena >= 6 && ocena <= 10) {
            return true;
        } else return false;
    }


    public void print(){
        System.out.print(this.predmet + " - ");
        System.out.print(this.profesor + " - ");
        System.out.print(this.ocena);
    }
}
