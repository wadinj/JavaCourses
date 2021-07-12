package exoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DemanderDouble();
    }

    private static void DemanderDouble() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Saisir un double");
        while (!isValid) {
            try {
                scanner = new Scanner(System.in);
                scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException exception) {
                // Uniquement si on a un probleme
                System.out.println("Problème lors de saisie... Veuillez resaisir votre double : ");
            }
        }
    }
}
