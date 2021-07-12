import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public Main() throws ParseException {
    }

    public static void main(String args[]) {
        System.out.println("Hello World");
        Machine machine = new Machine("Nom");
        Scanner scanner = new Scanner(System.in);
    }
    String string = "28/06/2021";
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date date = format.parse(string);

}
// Bonjour
