package FacebookPost_30_05_2022;

public class FacebookPostReakcijaMain {
    public static void main(String[] args) {
        Reakcija reakcija1 = new Reakcija("Smajli", "Marko");
        Reakcija reakcija2 = new Reakcija("Like", "Marija");
        Reakcija reakcija3 = new Reakcija("Srce", "Jovana");


        FacebookPost post1 = new FacebookPost();
        post1.setPunoIme("Marija Mitrovic");
        post1.setTekstObjave("Cao, mala");

        FacebookPost post2 = new FacebookPost();
        post2.setPunoIme("Dejan Mitrovic");
        post2.setTekstObjave("Eee, evo me");

        post2.reaguj(reakcija3);
        post2.stampaj();
        System.out.println();


        post1.reaguj(reakcija1);
        post1.reaguj(reakcija2);
        post1.reaguj(reakcija3);

        post1.stampaj();



    }
}
