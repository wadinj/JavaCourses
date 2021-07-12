package exerciceDeux;

import java.util.Date;

public class Moto extends Vehicule {

    public Moto(Date dateImmatriculation, String marque, String nom, int prix) {
        super(dateImmatriculation, marque, nom, prix);
    }

    @Override
    public double getTaux() {
        return 0.0012;
    }

    @Override
    public int getDelaiDecote() {
        return 14;
    }
}
