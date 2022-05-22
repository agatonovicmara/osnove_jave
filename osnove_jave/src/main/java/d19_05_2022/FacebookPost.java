package d19_05_2022;

public class FacebookPost {
    public String punoIme;
    public String punoImeVlasnikaProfila;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void like(){
        brojLajkova=brojLajkova+1;
    }
    public void dislike(){
        brojLajkova=brojLajkova-1;
    }
    public void share(){
        brojDeljenja=brojDeljenja+1;
    }
    public void print(){
        System.out.println(punoIme + " -->> " +punoImeVlasnikaProfila);
        System.out.println(tekstObjave);
        System.out.println("Likes:"+ brojLajkova+ " | Shares: " + brojDeljenja);
    }
}

