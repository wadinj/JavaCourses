package exerciceDeux;

import java.util.Date;

public class Camion extends Vehicule {

    public Camion(Date dateImmatriculation, String marque, String nom, int prix) {
        super(dateImmatriculation, marque, nom, prix);
    }

    @Override
    public double getTaux() {
        return 0.004;
    }

    @Override
    public int getDelaiDecote() {
        return 60;
    }
}
