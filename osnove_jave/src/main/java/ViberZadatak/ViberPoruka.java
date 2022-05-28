package ViberZadatak;

public class ViberPoruka {
    private ViberReakcija reakcija;
    private String tekst;
    private String vreme;
    private Viberkorisnik posiljalac;
    private Viberkorisnik primalac;
    private String emoji;

    public ViberPoruka(String tekst,
                       String vreme,
                       Viberkorisnik posiljalac,
                       Viberkorisnik primalac,
                       ViberReakcija reakcija)
                       {
        this.tekst = tekst;
        this.vreme = vreme;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija=reakcija;
    }



    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public Viberkorisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Viberkorisnik posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Viberkorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Viberkorisnik primalac) {
        this.primalac = primalac;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void prikazi(){
        System.out.print("From: "+ posiljalac.getPunoIme()
        + " * ");
        posiljalac.aktivan();
        System.out.println(" -at: "+this.vreme);
        System.out.println("To: "+primalac.getPunoIme());
        System.out.print(this.tekst+ " : ");
        if (this.reakcija != null) {
            System.out.print(reakcija.getEmoji() + " from "+ posiljalac.getPunoIme());}
    }
}
