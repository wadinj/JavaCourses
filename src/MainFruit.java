import java.util.*;

public class MainFruit {
    public static void main(String[] args) {

        // la machine est un tableau (5,5)
        String[][] machine = new String[5][5];
        // Possibilités d'emoji
        Map<String, String> hmap = initMapEmoji();
        // Liste du joueur
        //List<String> userChoices = new ArrayList<String>();

        // Nombre de coups
        int shots = 0;

        // Victoire ?
        boolean isVictory = false;

        // Récupérer les entrées
        Scanner scanner = new Scanner(System.in);

        // Init machine
        for (int i = 0; i < machine.length; i++) {
            for (int j = 0; j < machine[i].length ; j++) {
                machine[i][j] = GenererCase(hmap);
            }
        }

        // Tours
        while(!isVictory)
        {
            // Afficher la machine
            DisplayMachine(machine);

            // Tester s'il y a une ligne gagnante
            if(CheckWinnerLine(machine))
            {
                System.out.println("Hé, tu as gagné ! Tu a joué " +shots+ " coups.");
                isVictory = true;
                break;
            }

            System.out.println("Bloquer quel fruit ? Fraise, Carotte, Pasteque, Pomme.");
            // TO DO : ajouter les entrée dynamiquement selon hmap
            String userText = scanner.nextLine();

            if (hmap.containsKey(userText))
            {
                shots ++;
                for (int i = 0; i < machine.length; i++) {
                    for (int j = 0; j < machine[i].length; j++) {
                        if (hmap.get(userText) != machine[i][j]) {
                            machine[i][j] = GenererCase(hmap);
                        }
                    }
                }
            }
        }

    }

    private static Map<String, String> initMapEmoji() {
        Map<String, String> hmap = new LinkedHashMap<String, String>();

        hmap.put("Pasteque", "🍉");
        hmap.put("Pomme", "🍏");
        hmap.put("Fraise", "🍓");
        hmap.put("Carotte", "🥕");
        return hmap;
    }

    private static String GenererCase(Map emoji)
    {
        int min = 0;
        int max = emoji.size() -1;
        Random r = new Random();
        int randomNumber = min + (int)(Math.random() * ((max - min) + 1));
        String[] arrayKeys = new String[emoji.size()];
        // Collection des clés
        List keys = new ArrayList(emoji.keySet());
		/*for (int i = 0; i < keys.size(); i++) {
			Object obj = keys.get(i);
			System.out.println(obj.toString());
		}*/
        String choosenKey = keys.get(randomNumber).toString();
        return emoji.get(choosenKey).toString();
    }

    private static void DisplayMachine(String[][] machine)
    {
        for (int i = 0; i < machine.length; i++) {
            for (int j = 0; j < machine[i].length ; j++) {
                System.out.print(machine[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static boolean CheckWinnerLine(String[][] machine)
    {
        boolean result = true;

        for (int i = 0; i < machine.length; i++) {
            String value = machine[i][0];
            for (int j = 0; j < machine[i].length ; j++) {
                //System.out.println(value + " / " + machine[i][j]);
                if(machine[i][j] != value)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
