import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) throws TailleMissingException {
        // Une exception est comme une patate chaude, elle remonte la pile d'execution
        // Les méthodes Java peuvent renvoyer des exceptions :
        Scanner scanner = new Scanner(System.in);
        try {
            double input = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Probleme de type");
        } catch (NoSuchElementException e) {
        }

        demanderEntreeUser();

        System.out.println("On demande un nombre :");
        String nombre = scanner.nextLine();
        // On entre "bonjour", Le programme plante, c'est terrible.
    }

    private static void fermerConnexionBaseDeDonnees() {

    }

    private static void demanderEntreeUser() throws
            TailleMissingException, InputMismatchException {
        int i = 0;
        if (i == 2) {
            throw new TailleMissingException("Exception");
        }
        throw new InputMismatchException();
    }
}

// Exercice, demander un double à l'utilisateur tant que l'entrée est valide.
