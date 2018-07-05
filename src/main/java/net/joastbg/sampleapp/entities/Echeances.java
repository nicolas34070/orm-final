package net.joastbg.sampleapp.entities;

import java.util.Date;

public class Echeances {

    private int prix;
    private Date dateEmission;
    private Date datePaiement;
    private Date emissionFacture;
    
    public void impressionEcheancier(){
        System.out.println("Impression...");
    }
    
    /**
     * @return the prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     * @return the dateEmission
     */
    public Date getDateEmission() {
        return dateEmission;
    }

    /**
     * @param dateEmission the dateEmission to set
     */
    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    /**
     * @return the datePaiement
     */
    public Date getDatePaiement() {
        return datePaiement;
    }

    /**
     * @param datePaiement the datePaiement to set
     */
    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    /**
     * @return the emissionFacture
     */
    public Date getEmissionFacture() {
        return emissionFacture;
    }

    /**
     * @param emissionFacture the emissionFacture to set
     */
    public void setEmissionFacture(Date emissionFacture) {
        this.emissionFacture = emissionFacture;
    }
}
