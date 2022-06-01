package EON;

public class EONPaket extends Paket{

    public EONPaket(String nazivPaketa,
                    String korisnik,
                    int cena,
                    int ugovornaObaveza,
                    int brzinaDownload,
                    int brzinaUpload) {
        super(nazivPaketa, korisnik, cena,
                ugovornaObaveza, brzinaDownload, brzinaUpload);
    }


    @Override public int brMeseciPo1Din(){
        return 3;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj meseci po 1 din: " +brMeseciPo1Din());
    }
}
