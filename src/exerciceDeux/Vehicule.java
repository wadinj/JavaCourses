package exerciceDeux;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Vehicule {

    private Date dateImmatriculation;
    private String marque;
    private String name;
    private int price;

    public Vehicule(Date dateImmatriculation, String marque, String name, int price) {
        this.dateImmatriculation = dateImmatriculation;
        this.marque = marque;
        this.name = name;
        this.price = price;
    }

    public int getCurrentPrice() {
        int nbMois = getDifferenceMois();
        if(nbMois < 0) {
            return price;
        }
        int i = 0;
        int calculatedPrice = this.price;
        while(i != nbMois) {
            calculatedPrice = (int) (calculatedPrice - (getTaux() * calculatedPrice));
            i ++;
        }
        return calculatedPrice;
    }

    private int getDifferenceMois() {
        Date today = new Date();
        long diff = today.getTime() - dateImmatriculation.getTime();
        long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        int nbMois = Math.round(diffDays / getDelaiDecote());
        return nbMois;
    }

    public abstract double getTaux();

    public abstract int getDelaiDecote();
}
