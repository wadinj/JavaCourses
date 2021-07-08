public class ListeAndArrayMain {
    public static void main(String args[]) {
        // Il existe un autre type de données : Les tableaux
        // Un tableau est toujours typée c'est-à-dire qu'on a toujours un tableau de type X ou Y
        // On déclare une variable tableau d'entiers nommée "tableau"
        // Pour créer un tableau, on utilise le mot clé "new" puis le type[la taille du tableau]
        // Ici on créé un tableau d'entiers de taille 3.
        int tableau[] = new int[3];
        // Le premier element du tableau est à l'index 0 :
        // On affecte 10 dans notre tableau à l'index 0
        tableau[0] = 10;
        // On affecte 11 dans notre tableau à l'index 1
        tableau[1] = 11;
        // On affecte 12 dans notre tableau à l'index 2
        tableau[2] = 12;
        // On affiche le tableau : Quel est le résultat ?
        System.out.println(tableau);
        // Pourquoi ce résultat ? Le printer affiche l'adresse mémoire du tableau est pas les valeurs de celui-ci
        // Pour afficher les valeurs du tableau, il faut le parcourir à l'aide d'une boucle :
        // tableau.length permet de récupérer la taille du tableau (ici 3)
        for (int i = 0; i < tableau.length; i = i + 1) {
            System.out.println("Valeur du tableau à l'index " + i + " = " + tableau[i]);
        }
        // Différente façon d'initialiser le tableau :
        // On peut directement y affecter des valeurs
        tableau = new int[]{10, 12, 23, 34};

        // Un tableau peut avoir n'importe quelle type :
        // Ici un tableau de chaine de caractère
        String textes[] = new String[]{"Bonjour", "Hello", "Guten Tag"};

    }
}

// 1. Déclarer un tableau d'entiers avec 1, 3, 5, 7, 9 et l'afficher dans la console sur une ligne :
        // Exemple: 1 3 5 7 9
// 2. Déclarer un tableau d'entiers avec 1, 3, 5, 7, 9 et afficher l'entier le plus grand
// 3. Écrire un programme qui inverse un tableau et l'affiche
// 4. Écrire un programme qui tri un tableau d'entiers dans l'ordre croissant

