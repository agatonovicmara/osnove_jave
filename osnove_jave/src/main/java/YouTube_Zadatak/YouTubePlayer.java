package YouTube_Zadatak;

public class YouTubePlayer {
    private Video video;
    private int kvalitetVidea;
    private String rezim;
    private double jacinaZvuka;
    private double trenutnoVreme;

    public Video getVideo() {
        return video;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public String getRezim() {
        return rezim;
    }

    public double getJacinaZvuka() {
        return jacinaZvuka;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public YouTubePlayer(Video video, double trenutnoVreme) {
        this.video = video;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = 75;
        this.kvalitetVidea = 144;
        this.rezim = "Mini player";
    }

    public void ucitajVideo(String videoID) {
        this.trenutnoVreme = 0;
    }

    public void pojacaj() {

        if (jacinaZvuka + 10 <= 100) {
            this.jacinaZvuka = this.jacinaZvuka + 10;
        } else {
            jacinaZvuka = 100;
        }
    }

    public void smanji() {
        if (jacinaZvuka >= 0) {
            this.jacinaZvuka = this.jacinaZvuka - 10;
        } else {
            jacinaZvuka = 0;
        }
    }

    public void postaviKvalitet(double brzinaInterneta) {
        if (brzinaInterneta <= 2) {
            kvalitetVidea = 144;
        }
        if (brzinaInterneta <= 4) {
            kvalitetVidea = 240;
        }
        if (brzinaInterneta <= 6) {
            kvalitetVidea = 360;
        }
        if (brzinaInterneta <= 8) {
            kvalitetVidea = 720;
        }
        if (brzinaInterneta > 8) {
            kvalitetVidea = 1080;
        }
    }

    public void aktivirajMiniPlayerMod() {
        this.rezim = "Mini player";
    }

    public void aktivirajBioskopskiMod() {
        this.rezim = "Bioskopski rezim";
    }

    public void aktivirajPrekoCelogEkranaMod() {
        this.rezim = "Rezim preko celog ekrana";
    }

    public void premotajUnapred() {
        if (trenutnoVreme + 10 < video.getDuzina()) {
            this.trenutnoVreme = this.trenutnoVreme + 10;
        } else {
            trenutnoVreme = video.getDuzina();
        }

    }

    public void premotajUnazad() {
        if (trenutnoVreme - 10 > 0) {
            trenutnoVreme = trenutnoVreme - 10;
        } else {
            trenutnoVreme = 0;
        }
    }

    public void iscrtajZvuk() {
        double brCrtica = jacinaZvuka / 10;
        if (jacinaZvuka == 0) {
            System.out.print("Zvuk: </");
        } else {
            System.out.print("Zvuk: <:");
            for (int i = 0; i <= brCrtica; i++) {
                System.out.print("|");
            }

        }
    }

    public void iscrtajRezim() {
        if (rezim.equals("Mini player")) {
            System.out.println("[ ]");
        } else if (rezim.equals("Bioskopski rezim")) {
            System.out.println("[...]");
        } else if (rezim.equals("Rezim preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }

    public void iscrtajTrenutnoVreme() {
        double minut = trenutnoVreme / 60;
        double sekund = trenutnoVreme % 60;
        double minutUkupnogVidea = video.getDuzina() / 60;
        double sekundUkupnogVidea = video.getDuzina() % 60;

        System.out.println(minut + ":"
                + sekund + " / "
                + minutUkupnogVidea + ":"
                + sekundUkupnogVidea);

    }

    public void iscrtajTimeline() {
        double brojZvezdica = this.trenutnoVreme * 100 / video.getDuzina();
        double tackice = 100 - brojZvezdica;
        System.out.println();
        System.out.print("Timeline: ");
        for (int i = 0; i <= brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i <= tackice; i++) {
            System.out.print(".");

        }
        System.out.println();
    }

    public void iscitaj() {
        iscrtajTrenutnoVreme();
        iscrtajZvuk();
        iscrtajTimeline();
        System.out.println("Kvalitet: " + this.kvalitetVidea +"p.");
        System.out.println("Rezim: " + this.rezim);
        System.out.println("Naziv: "+video.getNaziv());
        System.out.println("Likes: " +
                video.getLike() + " | Dislikes: "
                + video.getDislike());
        System.out.println(video.getView() + " pregleda.");
    }
}



