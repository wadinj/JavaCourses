package card;

public abstract class Carte {
    private String banque;
    private String marque;
    private String region;
    private String randomNo;

    public double getCout() {
        double cout = this.getBaseCout();
        switch (banque) {
            case "SG":
                cout = cout * 1.2;
                break;
            case "BP":
                cout = cout * 1.25;
                break;
            case "CN":
                cout = cout * 1.5;
                break;
            case "CA":
                cout = cout * 1.15;
                break;
        }
        if(!this.region.equals("HF")) {
            cout = cout * 1.2;
        }
        return cout;
    }

    public abstract double getBaseCout();

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRandomNo() {
        return randomNo;
    }

    public void setRandomNo(String randomNo) {
        this.randomNo = randomNo;
    }
}
