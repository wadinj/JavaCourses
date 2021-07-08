public class FunctionAndClassesMain {
    public static void main(String args[]) {
        // Les fonctions permettent de "ranger" son code dans des "boites"
        // On les écrit :  <visiblité> <static(optional)>  <type de retour> <nom>(args)
        //  Imaginons :
        boolean estMajeur = estMajeur(19);
        System.out.println("Est majeur : " + estMajeur);



        // On peut maintenant utiliser notre voiture
        Voiture tesla = new Voiture();
        System.out.println(tesla);
    }

    public static boolean estMajeur(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }
}
// On créé une classe voiture
class Voiture {
    // On déclare ses attributs par principe en privée.
    private String marque;
    private String couleur;
    private int age;

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
}
