package exo2;

import java.util.*;

/**
 * 
 */
public class Hotel7 implements hotelLuxe {

    /**
     * Default constructor
     */
    public Hotel7() {
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
    public String modelTaxi;

    /**
     * 
     */
    public void descriptionPiscine() {

    	System.out.println("Piscine de " + taillePiscine + " m, rooftop avec cascade, et " + nbSauna + " saunas.");
    }

    /**
     * 
     */
    public void reserverTaxiLuxe() {
        System.out.println("taxi limousine");
    }

}