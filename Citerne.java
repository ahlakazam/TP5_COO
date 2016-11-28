package a;

/**
 * Created by Thomas on 28/11/2016.
 */
public class Citerne extends Chargement {

    public static final int charge_max = 10000;
    public static final int poids_vide = 3000;

    public Citerne () {
        super();
    }

    public Citerne (int charge, String immatriculation) throws Throwable {
        if (charge > Citerne.charge_max)
            throw new Throwable("Charge trop lourde");
        this.charge = charge;
        this.immatriculation = immatriculation;
    }

    public int getVitesse_max() {
        int vitesse = 0;
        if (this.charge == 0)
            vitesse = 130;
        else if (this.charge <= 1000)
            vitesse = 110;
        else if (this.charge <= 4000)
            vitesse = 90;
        else if (this.charge > 4000)
            vitesse = 80;
        return vitesse;
    }
}
