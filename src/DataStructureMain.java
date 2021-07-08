import java.util.*;

public class DataStructureMain {


    public static void main(String args[]) {
        LaListe();
        // Un Set est une liste avec des élements unique
        Set<String> stringSet = new HashSet<>();
        stringSet.add("set");
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Joe");
        myMap.put(2, "Donald");
        myMap.put(3, "Barack");
        String obama = myMap.get(3);
        System.out.println(obama);
    }

    private static void LaListe() {
        // List - tableau amélioré
        List<String> uneListe = new ArrayList<>();
        // L'avantage de la liste par rapport au tableau est l'ensemble des fonctions qui y sont attachés:
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
// Exercice
// Écrire une fonction qui prend en entrée une liste et renvoie la liste des éléments dupliqués
// Écrire une fonction qui prend en entrée une liste en renvoie uniquement la liste sans doublons
