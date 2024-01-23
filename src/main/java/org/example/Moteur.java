package org.example;

public class Moteur implements IMoteur{

    protected int nombreChevaux;
    protected String nom;

    public Moteur(int nombreChevaux, String nom) {
        this.nombreChevaux = nombreChevaux;
        //this.nom = nom;
    }

    public String reference() {
       return nom.toUpperCase() +
               "-" + nombreChevaux;
    }

}
