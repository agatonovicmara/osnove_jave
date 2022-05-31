package d30_05_2022;

import java.util.ArrayList;

public class Kombinacija {

    private String id;
    private ArrayList<Integer> nizBrojeva = new ArrayList<>();
    private int broj1;
    private int broj2;
    private int broj3;
    private int broj4;
    private int broj5;
    private int broj6;
    private int broj7;

    public Kombinacija() {
    }

    public Kombinacija(String id, int broj1, int broj2,
                       int broj3, int broj4, int broj5,
                       int broj6, int broj7) {
        this.id = id;
        nizBrojeva.add(broj1);
        nizBrojeva.add(broj2);
        nizBrojeva.add(broj3);
        nizBrojeva.add(broj4);
        nizBrojeva.add(broj5);
        nizBrojeva.add(broj6);
        nizBrojeva.add(broj7);
    }

    public String getId() {
        return id;
    }

    public int getBroj1() {
        return broj1;
    }

    public int getBroj2() {
        return broj2;
    }

    public int getBroj3() {
        return broj3;
    }

    public int getBroj4() {
        return broj4;
    }

    public int getBroj5() {
        return broj5;
    }

    public int getBroj6() {
        return broj6;
    }

    public int getBroj7() {
        return broj7;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int counter = 0;
        for (int i = 0; i < this.nizBrojeva.size(); i++) {
            if (this.nizBrojeva.get(i) == k.nizBrojeva.get(i)) {
                counter++;
            }
        }
        return counter == 7;
    }


    public void print() {
        System.out.println("ID: " + this.id);
        System.out.print("Brojevi: ");
        for (int i = 0; i < this.nizBrojeva.size(); i++) {
            System.out.print(this.nizBrojeva.get(i));
            if (i < this.nizBrojeva.size() - 1)
                System.out.print(", ");

        }
        System.out.println();
    }


}
