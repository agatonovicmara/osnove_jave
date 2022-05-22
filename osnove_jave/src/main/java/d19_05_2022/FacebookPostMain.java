package d19_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost cao = new FacebookPost(); // defaultni konstruktor
        cao.punoIme= "Marija Mitrovic";
        cao.punoImeVlasnikaProfila= "Vladimir Minic";
        cao.brojDeljenja=3;
        cao.brojLajkova=4;
        cao.tekstObjave="Cao Vlado, gde si, kako si?";

        FacebookPost evo = new FacebookPost("Vladimir Minic",
                "Marija Mitrovic", "Evo me, Maro, kako si ti?");


        cao.dislike();
        cao.like();
        cao.like();
        cao.like();
        cao.like();
        cao.share();
        cao.print();

        evo.dislike();
        evo.like();
        evo.like();
        evo.like();
        evo.like();
        evo.like();
        evo.like();
        evo.share();
        evo.print();



    }
}
