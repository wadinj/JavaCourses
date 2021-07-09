public class Machine {
    private String[][] plateau;

    private String uneMarqueDeVoiture;
    private final String VERSION_LOGICIEL = "1.0";
    public Machine() {
        this.initPlateau();
    }


    public Machine(String nom) {
        System.out.println("Constructeur" + nom);
    }

    public void initPlateau() {
        this.plateau = new String[5][5];
    }
}
