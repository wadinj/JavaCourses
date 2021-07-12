package exoFile;

import java.io.*;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileToModify = "hello.txt";
        File file = new File(fileToModify);

        if(file.exists()) {
            // S'il existe, écrire l'entete + ajouter tout le contenu
            String contenu = Main.ReadFromInputStream(new FileInputStream(file));
            ecrireEntete(fileToModify, contenu);
        } else {
            ecrireEntete(fileToModify, "");
        }
    }

    private static void ecrireEntete(String filename, String contenu) {
        // S'il n'existe pas, on écrit l'entete
        try {
            String titre = "Un super titre";
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String strDate = dateFormat.format(date);

            FileWriter myWriter = new FileWriter(filename);
            // On écrit l'entete
            myWriter.write(strDate + " - " + titre);
            myWriter.write("\r\n");
            myWriter.write(contenu);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static String ReadFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
