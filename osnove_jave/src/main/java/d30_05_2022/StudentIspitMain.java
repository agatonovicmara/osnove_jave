package d30_05_2022;

import org.w3c.dom.ls.LSOutput;

public class StudentIspitMain {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Matematika", "Milivoje Pavlovic", 9);
        Ispit ispit2 = new Ispit("Informatika", "Ivan Ilic", 8);
        Ispit ispit3 = new Ispit("Programiranje", "Jovan Pavlovic", 7);
        Ispit ispit4 = new Ispit("Java", "Milan JOvanovic", 7);

        Student student = new Student();
        student.setBrojIndeksa(2030);
        student.setPunoIme("Marija Mitrovic");
        student.setTipStudija("Master");

        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.dodajIspit(ispit4);

        student.print();





    }
}
