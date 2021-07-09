package card;

public class Main {
    public static void main(String args[]) {
        Carte c = new VisaCarte();
        c.setBanque("SG");
        c.setRegion("AR");
        System.out.println(c.getCout());
    }
}
