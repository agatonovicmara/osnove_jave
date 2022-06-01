package EON;

public class DUOPaket extends Paket{

    private String uredjaj;

    public DUOPaket(String nazivPaketa, String korisnik, int cena, int ugovornaObaveza,
                    int brzinaDownload, int brzinaUpload, String uredjaj) {
        super(nazivPaketa, korisnik, cena, ugovornaObaveza,brzinaDownload,brzinaUpload);
        this.uredjaj=uredjaj;
    }

    public String getUredjaj() {
        return uredjaj;
    }

    public void setUredjaj(String uredjaj) {
        this.uredjaj = uredjaj;
    }

    public void povecajBrzinu(int uvecanje){
        this.brzinaDownload=this.brzinaDownload+uvecanje;
        this.brzinaUpload=this.brzinaUpload+uvecanje;
    }

    @Override
    public int brMeseciPo1Din(){
        return 6;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj meseci po 1 din: "+ brMeseciPo1Din());
        System.out.println("Uredjaj na poklon: "+this.uredjaj);
    }
}
