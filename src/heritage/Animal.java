package heritage;


// On déclare une classe Animal
public abstract class Animal {
    private int taille;

    public Animal(int taille) {
        this.taille = taille;
    }

    public abstract void cri();

    public abstract String bonjour();

    public void direBonjour() {
        System.out.println("L'animal dit : " + bonjour());
    }
    public void faireUnPas() {
        cri();
        System.out.println("L'animal avance");
    }

    // Privée, donc pas disponible à l'extérieur. Même pour les classes enfants
    private void pleurer(int taille) {

        int i = 1;
        System.out.println("* Pleure *");
    }
}
