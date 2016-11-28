package a;

import java.util.ArrayList;

/**
 * Created by Thomas on 28/11/2016.
 */
public class Convoi {

    private ArrayList<Vehicule> chaine;

    public Convoi() {
        this.chaine = new ArrayList<Vehicule>();
    }

    public void addVehicle (Vehicule v) {
        this.chaine.add(v);
    }

    public void removeVehicle (int indice) {
        this.chaine.remove(indice);
    }

    public int getVitesseMax () {
        int i=0;
        int vitesse = 1000;
        for (i=0 ; i < this.chaine.size() ; i++)
        {
            if (this.chaine.get(i).getVitesse_max() < vitesse)
                vitesse = this.chaine.get(i).getVitesse_max();
        }
        return vitesse;
    }
}

