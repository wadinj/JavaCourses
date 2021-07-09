public class FunctionAndClassesMain {
    public static void main(String args[]) {
    //    monProgramme();
        int laSomme = laSommeDeAndre(1, 2);
        System.out.println(laSomme);
    }


    private static int laSommeDeAndre(int nouveauEntier, int entier2) {
        return nouveauEntier + entier2;
    }
    private static void monProgramme() {
        // Les fonctions permettent de "ranger" son code dans des "boites"
        // On les écrit :  <visiblité> <static(optional)>  <type de retour> <nom>(args)
        //  Imaginons :
        System.out.println("Est majeur : " + estMajeur(19));

        // On peut maintenant utiliser notre voiture
        Voiture renault = new Voiture("Renault", "Rouge", 2);
        System.out.println(renault.toString());
    }


    public static boolean estMajeur(int age) {
        return age > 17;
    }
}

class Roue {
    private int taille;
    private String marqueJante;
}
// On créé une classe voiture
class Voiture {
    // On déclare ses attributs par principe en privée.
    private String marque;
    private String couleur;
    private int age;
    private Roue avantGauche;
    private int positionX;
    private int positionY;

    void tournerAGauche() {
        positionY = positionY - 1;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    // Le constructeur est une méthode spéciale qui permet d'initialiser un objet avec le mot-clé "new"
    public Voiture(String marque, String couleur, int age) {
        // This permet de faire référence à la classe dans laquel on se trouve
        // this.marque != marque ici.
        this.marque = marque;
        this.couleur = couleur;
        this.age = age;
    }

    // Surcharge du constructeur
    public Voiture() {
        this.marque = "Tesla";
        this.couleur = "Rouge";
        this.age = 2;
    }

    // La méthode toString permet d'afficher notre classe de façon élégante.
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", age=" + age +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
