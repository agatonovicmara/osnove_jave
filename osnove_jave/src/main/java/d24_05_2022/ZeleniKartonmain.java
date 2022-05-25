package d24_05_2022;

import java.util.ArrayList;

public class ZeleniKartonmain {
    public static void main(String[] args) {



        ArrayList<ZeleniKarton>ZeleniKarton = new ArrayList<>();
        ZeleniKarton karton1 = new ZeleniKarton();
        karton1.setPunoIme("Marija Mitrovic");
        karton1.setBrojIndeksa(2030);
        karton1.setNazivPredmeta("Engleski Jezik");
        karton1.setOcena(9);
        karton1.setImeProfesora("Dragan Tomovic");
        ZeleniKarton.add(karton1);

        ZeleniKarton karton2 = new ZeleniKarton();
        karton2.setPunoIme("Desa Kojic");
        karton2.setBrojIndeksa(2050);
        karton2.setNazivPredmeta("Turski Jezik");
        karton2.setOcena(6);
        karton2.setImeProfesora("Dragan Tomovic");
        ZeleniKarton.add(karton2);

        ZeleniKarton karton3 = new ZeleniKarton();
        karton3.setPunoIme("Darko Kojic");
        karton3.setBrojIndeksa(2010);
        karton3.setNazivPredmeta("Kineski Jezik");
        karton3.setOcena(7);
        karton3.setImeProfesora("Danijela Vasic");
        ZeleniKarton.add(karton3);

        ZeleniKarton karton4 = new ZeleniKarton();
        karton4.setPunoIme("Desa Vasic");
        karton4.setBrojIndeksa(2000);
        karton4.setNazivPredmeta("Spanski Jezik");
        karton4.setOcena(6);
        karton4.setImeProfesora("Nela Dragovic");
        ZeleniKarton.add(karton4);

        ZeleniKarton karton5 = new ZeleniKarton();
        karton5.setPunoIme("Ana Milic");
        karton5.setBrojIndeksa(2090);
        karton5.setNazivPredmeta("Ruski Jezik");
        karton5.setOcena(10);
        karton5.setImeProfesora("Dragan Jovic");
        ZeleniKarton.add(karton5);

        ZeleniKarton karton6 = new ZeleniKarton();
        karton6.setPunoIme("Jelena Minic");
        karton6.setBrojIndeksa(2070);
        karton6.setNazivPredmeta("Madjarski Jezik");
        karton6.setOcena(10);
        karton6.setImeProfesora("Dragana Davidovic");
        ZeleniKarton.add(karton6);

        ZeleniKarton karton7 = new ZeleniKarton();
        karton7.setPunoIme("Jelena Jovanovic");
        karton7.setBrojIndeksa(2010);
        karton7.setNazivPredmeta("Svedski Jezik");
        karton7.setOcena(7);
        karton7.setImeProfesora("Dragana Divic");
        ZeleniKarton.add(karton7);



//        karton1.print();
//        karton2.print();
//        karton3.print();
//        karton4.print();
//        karton5.print();
//        karton6.print();


        double suma=0;
        double prosecnaOcena=0;

        for (int i = 0; i < ZeleniKarton.size(); i++) {
            suma= suma + ZeleniKarton.get(i).getOcena();
            prosecnaOcena=suma/ZeleniKarton.size();

        }
        System.out.println("Prosecna ocena je: "+ prosecnaOcena);

        











    }
}
