package p3_6_2022_3_zadatak;

public class AtleticarMain {
    public static void main(String[] args) {

        Atleticar trkac1 = new Trkac("Marija M.", 53);
        Atleticar trkac2 = new Trkac("Ana V.", 56);
        Atleticar skakac1 = new Skakac("Iva B", 150);
        Atleticar skakac2 = new Skakac("Sasa J.", 156);

        Disciplina skok = new Disciplina("Skok u dalj", "skakacka");
        Disciplina trk = new Disciplina("110 m s preponama", "trkacka");


        skok.dodajAtleticara(skakac1);
        skok.dodajAtleticara(skakac2);

        trk.dodajAtleticara(trkac1);
        trk.dodajAtleticara(trkac2);

        skakac1.print();
        skakac2.print();
        trkac1.print();
        trkac2.print();

        trk.stampajnajboljeg();
        skok.stampajnajboljeg();
    }
}
