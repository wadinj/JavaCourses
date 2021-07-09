import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        // Une exception est comme une patate chaude, elle remonte la pile d'execution
        // Les méthodes Java peuvent renvoyer des exceptions :
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // On entre "bonjour", Le programme plante, c'est terrible.

    }
}
