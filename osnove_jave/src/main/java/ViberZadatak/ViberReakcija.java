package ViberZadatak;

public class ViberReakcija {
    private String emoji;
    private Viberkorisnik posiljalac;

    private Viberkorisnik primalac;


    public ViberReakcija(String emoji, Viberkorisnik posiljalac, Viberkorisnik primalac) {
        this.emoji = emoji;
        this.posiljalac = posiljalac;
        this.primalac=primalac;

    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
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

   }
