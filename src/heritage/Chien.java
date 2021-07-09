package heritage;


// On déclare une classe Chat qui hérite de Animal
// Toutes les méthodes de Animal seront disponibles pour Chien
public class Chien extends Animal {

    public Chien(int taille) {
        // le mot clé "super" permet d'appeler des élements de la classe mère.
        super(taille);
        // A noter que les attributs privé ne sont pas exposés
    }

    // On surcharge la méthode cri.
    public void cri() {
        System.out.println("Wouaf Wouaf !");
    }

    @Override
    public String bonjour() {
        return null;
    }
}
