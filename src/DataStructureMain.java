import java.util.*;

public class DataStructureMain {


    public static void main(String args[]) {
        LaListe();
        // Un Set est une liste avec des élements unique
        Set<String> stringSet = new HashSet<>();
        stringSet.add("set");
    }

    private static void LaListe() {
        // List - tableau amélioré
        List<String> uneListe = new ArrayList<>();
        // L'avantage de la liste par rapport au tableau, c'est quelle est pratiquec'est l'ensemble des fonctions qui y sont attachés:
        // On ajoute un élément
        uneListe.add("Hello");
        System.out.println(uneListe);
        uneListe.clear();
        uneListe.add("Jonathan");
        if(uneListe.contains("Jonathan")) {
            System.out.println("La liste contient Jonathan");
        }
    }
}
// Exercice 1
// Écrire une fonction qui prend en entrée une liste et renvoie la liste des éléments dupliqués
// Écrire une fonction qui prend en entrée une liste en renvoie uniquement la liste sans doublons
