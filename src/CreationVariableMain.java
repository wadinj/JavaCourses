import java.util.Scanner;

public class CreationVariableMain {
    public static void main(String args[]) {
        // En java, le ";" est toujours nécessaire à la fin de chaque instruction
        // Création de variable
        // Format :: <type> <nom> = <valeur>
        String bonjourString = "Bonjour";
        // On affiche le contenu de la variable "nom de la variable" avec notre fonction System.out.println()
        System.out.println(bonjourString);

        // Création d'une variable de type "entier" (int) => Un nombre
        int unNombre = 12;
        // On affiche notre variable de type "entier" (int)
        System.out.println(unNombre);

        // Il existe d'autres types : double (un nombre à virgule), char (un caractère) & bien d'autres.
        double unNombreAVirgule = 12.2;
        System.out.println(unNombreAVirgule);

        // On peut faire toute les opérations mathématiques sur ces variables :
        // On rajoute 2 à notre variable "unNombre"
        unNombre = unNombre + 2;
        System.out.println(unNombre);

        // Récupérer une variable via l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez taper une chaine de caractères :");
        // Cette opération est bloquante. Le programme va suspendre l'execution tant que l'utilisateur n'a pas tapé sur "ENTRER"
        String ceQueLutilisateurATape = scanner.nextLine();
        System.out.println("Vous avez tapé :");
        System.out.println(ceQueLutilisateurATape);
    }
}
