package FacebookPost_30_05_2022;

import java.util.ArrayList;

public class Reakcija {
    private String tipReakcije;
    private String reagovao;

    public Reakcija() {
    }

    public Reakcija(String tipReakcije, String reagovao) {
        this.tipReakcije = tipReakcije;
        this.reagovao = reagovao;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getReagovao() {
        return reagovao;
    }

    public void setReagovao(String reagovao) {
        this.reagovao = reagovao;
    }

}
