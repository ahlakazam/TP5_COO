package a;

/**
 * Created by Thomas on 28/11/2016.
 */
public class Bache extends Chargement {

    public static final int charge_max = 20000;
    public static final int poids_vide = 4000;

    public Bache (int charge, String immatriculation) throws Throwable {

        if (charge > Bache.charge_max)
            throw new Throwable("Charge trop lourde");
        if (charge < 0)
            throw new Throwable("Illegal value for charge");
        this.charge = charge;
        this.setImmatriculation(immatriculation);
    }

    public int getVitesse_max() {
        int vitesse = 0;
        if (this.charge == 0)
            vitesse = 130;
        else if (this.charge <= 3000)
            vitesse = 110;
        else if (this.charge <= 7000)
            vitesse = 90;
        else if (this.charge > 7000)
            vitesse = 80;
        return vitesse;
    }

}
