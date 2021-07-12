package exerciceDeux;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String string = "10/06/2021";
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(string);
        Vehicule v1 = new Voiture(date, "Peugeot", "Ww", 2000);
        System.out.println(v1.getCurrentPrice());

        string = "15/08/2021";
        format = new SimpleDateFormat("dd/MM/yyyy");
        date = format.parse(string);
        v1 = new Voiture(date, "Peugeot", "Ww", 2000);
        System.out.println(v1.getCurrentPrice());

        string = "10/07/2021";
        format = new SimpleDateFormat("dd/MM/yyyy");
        date = format.parse(string);
        v1 = new Voiture(date, "Peugeot", "Ww", 2000);
        System.out.println(v1.getCurrentPrice());

        string = "01/05/2021";
        format = new SimpleDateFormat("dd/MM/yyyy");
        date = format.parse(string);
        v1 = new Voiture(date, "Peugeot", "Ww", 2000);
        System.out.println(v1.getCurrentPrice());
    }
}
