package d24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun racunSaKogSePrenoseSredstva=new Racun("Jovan Pavlovic", "1234-5678-9876-5432", 30000);
        Racun racunNaKojiSePrenoseSredstva= new Racun("Marko Sojanovic", "8888-6666-5555-4444", 10000);

        Transakcija transakcija1=new Transakcija(123, racunSaKogSePrenoseSredstva, racunNaKojiSePrenoseSredstva);

        double transakcija = transakcija1.izvrsiTransakciju(10000.00);
        System.out.println(transakcija);

        









    }
}
