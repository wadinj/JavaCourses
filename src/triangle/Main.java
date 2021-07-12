package triangle;

public class Main {

    public static void floyd(int lignes) {
        if (lignes <= 0)
            return;

        int count = 1;
        int nombre = 1;
        while (count <= lignes) {
            for (int i = 0; i < count; i++) {
                System.out.print(nombre + " ");
                nombre++;
            }
            count++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 10;
        triangle(n);
        floyd(n);
    }

    private static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
