package YouTube_Zadatak;

public class Video {
    private String videoID;
    private String naziv;
    private double duzina;
    private int like;
    private int dislike;
    private int view;


    public Video(String videoID,
                 String naziv,
                 double duzina,
                 int like,
                 int dislike,
                 int view) {
        this.videoID = videoID;
        this.naziv = naziv;
        this.duzina = duzina;
        this.like = like;
        this.dislike = dislike;
        this.view = view;
    }

    public void lajkuj(){
        like=like+1;
    }
    public void dislike(){
        dislike=dislike-1;
    }
    public void viewVideo(){
        view=view+1;
    }

    public String getVideoID() {
        return videoID;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getDuzina() {
        return duzina;
    }

    public int getLike() {
        return like;
    }

    public int getDislike() {
        return dislike;
    }

    public int getView() {
        return view;
    }
}
