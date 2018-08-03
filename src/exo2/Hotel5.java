package exo2;

import java.util.*;

/**
 * 
 */
public class Hotel5 implements hotelLuxe {

    /**
     * Default constructor
     */
    public Hotel5() {
    }

    /**
     * 
     */
    public int taillePiscine;

    /**
     * 
     */
    public int nbSauna;


    /**
     * 
     */
    public void descriptionPiscine() {

    	System.out.println("Piscine de " + taillePiscine + " m, en forme de lune, avec " + nbSauna + " saunas.");
    }

    /**
     * 
     */
    public void reserverTaxiLuxe() {

    	System.out.println("taxi mercedes");
    }

	public int getTaillePiscine() {
		return taillePiscine;
	}

	public void setTaillePiscine(int taillePiscine) {
		this.taillePiscine = taillePiscine;
	}

	public int getNbSauna() {
		return nbSauna;
	}

	public void setNbSauna(int nbSauna) {
		this.nbSauna = nbSauna;
	}


}