package com.example.racel;

public class Cars {
    private String marque;
    private String modele;
    private String carburant;
    private int prix;
    private int annee;

    public Cars(String marque, String modele, String carburant, int prix, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
        this.prix = prix;
        this.annee = annee;
    }

    public String getModel() {
        return modele;
    }

    public void setModel(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
