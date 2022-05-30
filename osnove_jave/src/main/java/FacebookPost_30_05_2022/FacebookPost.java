package FacebookPost_30_05_2022;

import java.util.ArrayList;

public class FacebookPost {
    private String punoIme;
    private String tekstObjave;
    private ArrayList<Reakcija>nizReakcija=new ArrayList<>();

    public FacebookPost() {

    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public ArrayList<Reakcija> getNizReakcija() {
        return nizReakcija;
    }

        public void reaguj(Reakcija reakcija){
        this.nizReakcija.add(reakcija);
    }
    private int brReakcijaOdredjenogTipa(String tipReakcije){
        int count=0;
        for (int i = 0; i < nizReakcija.size(); i++) {
            if(nizReakcija.get(i).getTipReakcije().equals(tipReakcije)){
                count=count+1;
            }
        }return count;

    }
    public void stampaj(){
        System.out.println(this.punoIme);
        System.out.println(this.tekstObjave);
        System.out.print("Srce "+ brReakcijaOdredjenogTipa("Srce")+ " | ");
        System.out.print("Like "+ brReakcijaOdredjenogTipa("Like")+ " | ");
        System.out.print("Smajli "+ brReakcijaOdredjenogTipa("Smajli")+ " | ");
    }
}
