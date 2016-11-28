package a;

/**
 * Created by Thomas on 28/11/2016.
 */
public abstract class Chargement extends Vehicule {

    public static final int charge_max = 0;
    protected int charge;

    public Chargement () {
        super();
        this.charge = 0;
    }
}
