package org.example;

public class Voiture {

    protected String immatriculation;
    protected IMoteur moteur;

    public Voiture() {
    }

    public Voiture(String immatriculation) {
        this.setImmatriculation(immatriculation);
    }

    public String code() {
        return immatriculation + moteur.reference();
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation.toUpperCase();
    }

    public IMoteur getMoteur() {
        return moteur;
    }

    public void setMoteur(IMoteur moteur) {
        this.moteur = moteur;
    }
}
