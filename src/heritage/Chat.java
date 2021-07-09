package heritage;


// On déclare une classe Chat qui hérite de Animal
public class Chat extends Animal {

    public Chat(int taille) {
        // le mot clé "super" permet d'appeler des élements de la classe mère.
        super(taille);
        // A noter que les attributs privé ne sont pas exposés
    }

    //  On surcharge la méthode cri
    public void cri() {
        System.out.println("Meowww !");
    }
}
