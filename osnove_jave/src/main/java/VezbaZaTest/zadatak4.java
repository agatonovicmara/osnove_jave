package VezbaZaTest;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String akcija = "";
        double jacinaZvuka = 75;

        while (!akcija.equals("play")) {
            System.out.print("Uneti akciju (up, down, mute ili play): ");
            akcija = s.next();

            if (akcija.equals("up")) {
                jacinaZvuka = jacinaZvuka + 7.5;
            } if (akcija.equals("down")) {
                jacinaZvuka = jacinaZvuka - 7.5;
            } if (akcija.equals("mute")) {
                jacinaZvuka = 0;

            }if (jacinaZvuka<0){
                jacinaZvuka=0;
            }if (jacinaZvuka>100){
                jacinaZvuka=100;
            }


        }
        System.out.println("Jacina zvuka je: " + jacinaZvuka + ".");
    }
}
