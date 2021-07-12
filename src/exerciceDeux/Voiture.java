package exerciceDeux;

import java.util.Date;

public class Voiture extends Vehicule {

    public Voiture(Date dateImmatriculation, String marque, String nom, int prix) {
        super(dateImmatriculation, marque, nom, prix);
    }

    @Override
    public double getTaux() {
        return 0.002;
    }

    @Override
    public int getDelaiDecote() {
        return 30;
    }
}
