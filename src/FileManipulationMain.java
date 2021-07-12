import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulationMain {
    public static void main(String[] args) throws IOException {
        //createFile();
        File f = new File("test.txt");
        f.exists()
        f.createNewFile();
        //writeTo("test.txt", "J'écris dans un fichier c'est génial");
    }

    private static void createFile() {
        try {
            // On instancie un objet de type File "filename.txt"
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeTo(String filename, String content) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void read(String file) {
        try {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

/*
Exercice:
1. Créer un fichier "hello.txt" s'il n'existe pas & écrire "Hello World" dedans
2. Créer une fonction ajouterEntete(File file, String titre) qui ajoute "la date - le titre" à la premiere ligne du fichier
 */
