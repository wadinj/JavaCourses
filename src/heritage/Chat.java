package heritage;


// On déclare une classe Chat qui hérite de Animal
public class Chat extends Animal {
    private int tailleGriffe;

    public Chat(int taille) {
        // le mot clé "super" permet d'appeler des élements de la classe mère.
        super(taille);
        // A noter que les attributs privé ne sont pas exposés
    }

    @Override
    public void cri() {
        System.out.println("Meooow");
    }

    @Override
    public String bonjour() {
        return null;
    }

    //  On surcharge la méthode cri

}
