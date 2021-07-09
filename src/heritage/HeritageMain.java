package heritage;

// Principe :
// Une classe peut hériter uniquement d'une autre classe
public class HeritageMain {
    public static void main(String[] args) {
        // On déclare une variable "chat" de type Animal ayant comme valeur une instance de type Chat
        Animal chat = new Chat(12);
        // On déclare une variable "chien" de type Animal ayant comme valeur une instance de type Chien
        Animal chien = new Chien(12);
        // On déclare une variable "animal" de type Animal ayant comme valeur une instance de type Animal
        // Un chat
        chat.cri();
        // Un chat
        chien.cri();
        // Un animal
    }
}
