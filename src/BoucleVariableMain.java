import java.util.Random;

public class BoucleVariableMain {

    public static void exo1() {

    }
    public static void main(String args[]) {
        // En Java, il existe trois types de boucle :
        // La boucle while
        // Signifie : Tant que i < 10
        int age = 0;
        BoucleVariableMain.exo1();
        while(age < 10) {
            // Ici, on peut concaténer des chaines de caractères avec l'opérateur plus, ici :
            // chaine de caractère "Age " + la valeur de la variable age.
            System.out.println("Age " +  age);
            age = age + 1;

        }
        // La boucle For
        // Pour la variable de type "entier" nommé "i" = 0 ; <TANT QUE> condition ; <OPERATION A EFFECTUÉ CHAQUE TOUR DE BOUCLE>
        // Format : for("On déclare la variable" ; "condition d'arrêt" ; "opération effectué à chaque tour de boucle")
        for(int i = 0 ; i < 10 ; i = i + 1) {
            System.out.println(i);
        }
        // La boucle do while, pas nécessaire pour l'instant

        // Générer un entier aléatoire :
        Random random = new Random();
        int nombreAleatoire = random.nextInt();
        System.out.println(nombreAleatoire);

    }
}

// Exercice
/*
    1. Afficher les nombres de 1 à 100
    2. Afficher les nombres paires de 1 à 100
    3. Afficher les nombres impaires de 1 à 100
    4. Demander une lettre à l'utilisateur puis demander le nombre de fois que l'utilisateur souhaite afficher la lettre (N).
       Afficher la lettre N fois.
    5. Écrire un programme qui demande à l'utilisateur un nombre N et afficher la somme de tout les nombres de 1 à N, exemple :
        * N = 3
        * On affiche 1+2+3 = 6
    6. Implémenter un jeu "Guess a number".
        1. Générer un nombre aléatoire
        2. Tant que l'utilisateur ne trouve pas, lui demander le nombre
        3. Si le nombre entré est inférieur au nombre aléatoire, afficher "Trop petit"
        3. Si le nombre entré est supérieur au nombre aléatoire, afficher "Trop grand"
        4. Si le nombre entré est égale au nombre aléatoire, afficher "Victoire !!" et arrêter le programme doit s'arreter.
    7. Afficher la table de multiplication jusque 10
    (Bonus) Soignez l'affichage :
        1*1 = 1
        1*2 = 2 ...
    8. (Recherche) Prendre une chaine de caractère en entrée utilisateur et l'afficher "retourné" :
        Bonjour -> Affiche ruojnoB

    9. (Recherche) Écrire une fonction qui inverse un nombre sans utiliser les méthodes String
 */

