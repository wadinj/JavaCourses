package heritage;

// Principe :
// Une classe peut implémenter plusieurs interfaces

public class InterfaceMain {
    public static void main(String[] args) {
        // On déclare une variable "chat" de type Animal ayant comme valeur une instance de type Chat
        Animal chat = new Chat(12);
        // On déclare une variable "chien" de type Animal ayant comme valeur une instance de type Chien
        Animal chien = new Chien(12);
        // On déclare une variable "animal" de type Animal ayant comme valeur une instance de type Animal
        Animal animal = new Animal(12);
        // Un chat
        chat.cri();
        // Un chat
        chien.cri();
        chien.faireUnPas();
        // Un animal
        animal.cri();
        animal.faireUnPas();
    }
}
