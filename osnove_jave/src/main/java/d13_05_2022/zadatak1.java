package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;



public class zadatak1 {
    public static void main(String[] args) {
//
//        Napisati program koji ima niz brojeva od 25 elemenata,
//        koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti (ne unosi ih korisnik)
//        zatim korisnik unosi poziciju za koju se racuna suma.
//        Suma za poziciju se racuna tako sto se na vrednost tog polja
//        dodaju vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa
//        (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!


        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(26);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);
        numbers.add(24);
        numbers.add(25);




        for (int i = 0; i < numbers.size(); i++) {

            if (i % 5 == 0) {

                System.out.println();
            }
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println("" +  "\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju od 0 do 24: ");
        int pozicija = s.nextInt();
        int suma = 0;

        if (pozicija==0 ){
            suma = numbers.get(1) + numbers.get(5);
            System.out.println("Suma je: " + suma);
        }

        else if (pozicija==1){
            suma = numbers.get(0) + numbers.get(2)+numbers.get(6);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==2){
            suma = numbers.get(1) + numbers.get(3)+numbers.get(7);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==3){
            suma = numbers.get(2) + numbers.get(4)+numbers.get(8);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==4){
            suma = numbers.get(3) + numbers.get(9);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==5){
            suma = numbers.get(0) + numbers.get(6)+numbers.get(10);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==6){
            suma = numbers.get(1) + numbers.get(5)+numbers.get(7)+numbers.get(11);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==7){
            suma = numbers.get(2) + numbers.get(6)+numbers.get(8)+numbers.get(12);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==8){
            suma = numbers.get(3) + numbers.get(7)+numbers.get(9)+numbers.get(13);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==9){
            suma = numbers.get(4) + numbers.get(8)+numbers.get(14);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==10){
            suma = numbers.get(5) + numbers.get(11)+numbers.get(15);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==11){
            suma = numbers.get(6) + numbers.get(10)+numbers.get(16)+numbers.get(12);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==12){
            suma = numbers.get(7) + numbers.get(11)+numbers.get(13)+numbers.get(17);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==13){
            suma = numbers.get(8) + numbers.get(12)+numbers.get(14)+numbers.get(18);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==14){
            suma = numbers.get(9) + numbers.get(13)+numbers.get(19);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==15){
            suma = numbers.get(10) + numbers.get(16)+numbers.get(20);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==16){
            suma = numbers.get(11) + numbers.get(15)+numbers.get(17)+numbers.get(21);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==17){
            suma = numbers.get(12) + numbers.get(16)+numbers.get(18)+numbers.get(22);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==18){
            suma = numbers.get(13) + numbers.get(17)+numbers.get(19)+numbers.get(23);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==19){
            suma = numbers.get(14) + numbers.get(18)+numbers.get(24);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==20){
            suma = numbers.get(15) + numbers.get(21);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==21){
            suma = numbers.get(20) + numbers.get(16)+numbers.get(22);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==22){
            suma = numbers.get(21) + numbers.get(17)+numbers.get(23);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==23){
            suma = numbers.get(22) + numbers.get(18)+numbers.get(24);
            System.out.println("Suma je: " + suma);
        }
        else if (pozicija==24){
            suma = numbers.get(23) + numbers.get(19);
            System.out.println("Suma je: " + suma);
        }
        // razmisljam o nekom elegantnijem resenju...

    }
}
