package condition;

import java.util.Scanner;

public class ConditionVariableMain {
    public static void main(String args[]) {
        // En programmation, nous avons deux principales structures de contrôle :
        // La condition & la boucle
        // Je déclare une variable de type "entier" nommée "age" égale à 10
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // Si ma variable age est supérieur à 17, j'affiche "il est majeur"
        if(age > 17) {
            System.out.println("Il est majeur");
        } else { // Sinon
            System.out.println("Il est mineur");
        }
        // Vérifier que le programme fonctionne avec age = 2, age = 18, age = 17, age = 70

        // Multiple conditions
        if(age > 70) { // Si
            System.out.println("Retraité");
        } else if(age > 18) { // Si sinon
            System.out.println("Jeune actif");
        } else if(age > 15) { // Si sinon
            System.out.println("Lycéen");
        } else if(age > 10) { // Si sinon
            System.out.println("Collégien");
        } else { // Sinon
            System.out.println("Primaire ou maternelle ou bébé");
        }

        // Opérateur logique
        // Nos conditions peuvent inclure des OU et/ou des ET
        // Un OU signifie soit la condition 1 soit la condition 2
        // Si age > 70 OU age < 18 alors on affiche "Non actif"
        if(age > 70 || age < 18) {
            System.out.println("Non actif");
        }

        // Exemple avec ET
        // age > 70 ET age < 100
        if(age > 70 && age < 100) {
            System.out.println("Retraité mais pas centenaire");
        }
        // On peut aussi combiner autant d'opérateur que l'on souhaite
        if(age != 60 || age == 30 || age == 90) {
            System.out.println("Age est multiple de 30 :)");
        }
        // Pour comparer des variables de type int, on a :
        /*
            * != : Différent
            * == : Égalité
            * > : Supérieur
            * < : Inférieur
            * >= : Supérieur ou égal
            * <= : Inférieur ou égal
         */
    }
}

// Exercice
/*
    Créer un main "ExerciceIMCMain"
    Le programme doit afficher : "Bonjour, bienvenue dans le calculateur d'IMC"
                                 "Quel est votre poids ?" + Demander le poids de l'utilisateur
                                 "Quel est votre taille ?" + Demander la taille de l'utilisateur
                                 "Votre IMC est de XX"
    Pour rappel IMC = poids en kg / taille²
    Afficher la catégorie dans laquelle l'IMC de la personne est :
    en dessous de 18,4 kg/m², on considère que la personne est maigre,
    entre 18,5 et 24,9 kg/m², on considère que la personne a une corpulence "normale",
    entre 25 et 29,9 kg/m², on considère que la personne est en surpoids,
    entre 30 à 34,9 kg/m², on considère que la personne est en obésité modérée,
    entre 35 et 39,9 kg/m², on considère que la personne est en obésité sévère,
    au-dessus de 40 kg/m², on considère que la personne est en obésité morbide.
 */

// Bonus
/*
    Créer un main permettant de savoir si un nombre et pair ou impair
    // Demander un nombre à l'utilisateur
    // Pour obtenir une variable de type int à partir de l'utilisateur on doit utiliser :
        * int nombre = scanner.nextInt()
    Un opérateur peut être utile : % => Il correspond au reste de la division euclidienne (entière), exemple :
        10 % 2 = 0 (car 10 / 2 = 5 et il reste 0)
        11 % 2 = 1 (car 11 / 2 = 5 et il reste 1)

// Recherche
    Prendre deux ages en entrée (age 1 et age 2).
    Renvoyer "1 unique majeur" si uniquement 1 des ages est inférieur à 18
 */
