package a;

/**
 * Created by Thomas on 28/11/2016.
 */

public class Vehicule implements Engin {

    private static final int poids_vide = 0;
    private String immatriculation;

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getVitesse_max() {
        return 150;
    }

    public int getWeight() {
        return 0;
    }
    public int getHorsePower() {
        return 0;
    }
}
