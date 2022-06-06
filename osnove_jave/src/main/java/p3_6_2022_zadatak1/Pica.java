package p3_6_2022_zadatak1;

public class Pica extends Proizvod{
    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena(){
        int ukupnaCena = 0;
        ukupnaCena=this.cenaDodataka()+this.cenaPodloge;
        return ukupnaCena;
    }
    public void print(){
        System.out.println("Cena podloge: "+ this.cenaPodloge+ " din.");
        System.out.print("Dodaci: ");
        for (int i = 0; i < dodaci.size(); i++) {
            System.out.print(dodaci.get(i).getNaziv()+ ", ");

        }
        System.out.println();
        System.out.println("Ukupna cena: "+ ukupnaCena()+ " din.");
        System.out.println();
    }
}
