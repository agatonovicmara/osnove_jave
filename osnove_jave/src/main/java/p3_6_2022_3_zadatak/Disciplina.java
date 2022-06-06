package p3_6_2022_3_zadatak;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;

    private ArrayList<Atleticar> atleticari = new ArrayList<>();

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public void dodajAtleticara(Atleticar a) {
        atleticari.add(a);
    }

    public void diskvalifikuj(String punoIme) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (punoIme.equals(this.atleticari.get(i).getPunoIme())) {
                this.atleticari.remove(i);
            }
        }
    }

    public Atleticar nadjinajboljeg() {
        Atleticar najbolji = this.atleticari.get(0);
        for (int i = 0; i < atleticari.size(); i++) {
            if (this.atleticari.get(i).bolji(najbolji)) {
                najbolji = this.atleticari.get(i);
            }
        }
        return najbolji;
    }

    public void stampajnajboljeg() {
        System.out.print("Najbolji u svojoj disciplini je: ");

        System.out.println(nadjinajboljeg().getPunoIme());
    }
}
