package d19_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost cao = new FacebookPost();
        cao.punoIme= "Marija Mitrovic";
        cao.punoImeVlasnikaProfila= "Vladimir Minic";
        cao.brojDeljenja=3;
        cao.brojLajkova=4;
        cao.tekstObjave="Cao Vlado, gde si, kako si?";

        FacebookPost evo = new FacebookPost();
        evo.punoIme= "Vladimir Minic";
        evo.punoImeVlasnikaProfila="Marija Mitrovic";
        evo.brojDeljenja= 5;
        evo.brojLajkova=6;
        evo.tekstObjave="Evo nista Maro, kod tebe?";

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
