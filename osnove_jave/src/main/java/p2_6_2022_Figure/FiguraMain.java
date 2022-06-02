package p2_6_2022_Figure;

import java.util.ArrayList;

public class FiguraMain {
    public static void main(String[] args) {
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(new JednakostranicniTrougao(5));
        figure.add(new Pravougaonik(5, 6));
        figure.add(new JednakostranicniTrougao(6));
        figure.add(new Pravougaonik(3, 4));
        figure.add(new Pravougaonik(8, 9));

        double suma = 0;
        for (int i = 0; i < figure.size(); i++) {
            suma = suma + figure.get(i).povrsina();
        }

        System.out.println("zbir svih povrsina je: " + suma);

        for (int i = 0; i < figure.size(); i++) {
            suma = suma + figure.get(i).obim();
        }
        System.out.println("Zbir svih obima je: " + suma);


    }
}
