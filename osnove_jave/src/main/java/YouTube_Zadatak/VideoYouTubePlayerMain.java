package YouTube_Zadatak;

public class VideoYouTubePlayerMain {
    public static void main(String[] args) {

        Video video = new Video("jklo98IIHkj",
                "'Uzburkano More'",
                200,
                0, 0, 200);


        YouTubePlayer player = new YouTubePlayer(video,
                100);


        video.lajkuj();
        video.lajkuj();
        video.lajkuj();
        video.viewVideo();

        player.pojacaj();
        player.aktivirajPrekoCelogEkranaMod();
        player.postaviKvalitet(30);
        player.premotajUnapred();
        player.iscitaj();


    }
}
