package Pasta;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak>sastojak=new ArrayList<>();

    public Pasta() {
    }

    public void dodajSastojak(Sastojak sastojak){
        this.sastojak.add(sastojak);
    }

    public void cenaPaste(){
        int suma = 0;
        for (int i = 0; i < sastojak.size(); i++) {
            suma= suma+this.sastojak.get(i).getCena();
        }
        System.out.println("cena paste je: "+suma+ " dinara.");
    }
    public void stampaj(){
        System.out.println("Pasta je sa satojcima: ");
            for (int i = 0; i < sastojak.size(); i++) {
                System.out.println(this.sastojak.get(i).getNaziv());
        }

            cenaPaste();

    }
    public void brisanjeSastojka(String sastojak){
        for (int i = 0; i < this.sastojak.size(); i++) {
            if(this.sastojak.get(i).getNaziv().equals(sastojak)){
                this.sastojak.remove(i);
                i--;
            }
        }
    }
}
