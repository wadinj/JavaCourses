package heritage;


// On déclare une classe Animal
public class Animal {
    private int taille;

    public Animal(int taille) {
        this.taille = taille;
    }

    public void cri() {
        System.out.println("Cri de l'animal inconnu");
    }

    public void faireUnPas() {
        System.out.println("L'animal avance");
    }

    // Privée, donc pas disponible à l'extérieur. Même pour les classes enfants
    private void pleurer() {
        System.out.println("* Pleure *");
    }
}
