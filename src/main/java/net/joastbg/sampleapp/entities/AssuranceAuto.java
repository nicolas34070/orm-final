package net.joastbg.sampleapp.entities;

import java.util.Date;

public class AssuranceAuto extends Assurance {

    private String Immatriculation;
    private int BonusMalus;
    private String conducteurPrimaire;
    private String conducteurSecondaire;
    private Sinistre[] mesSinistres;
    private int nbSinistres;
    
    public AssuranceAuto(){
        nbSinistres = 0;
    }
    
    /**
     * @return the Immatriculation
     */
    public String getImmatriculation() {
        return Immatriculation;
    }

    /**
     * @param Immatriculation the Immatriculation to set
     */
    public void setImmatriculation(String Immatriculation) {
        this.Immatriculation = Immatriculation;
    }

    /**
     * @return the BonusMalus
     */
    public int getBonusMalus() {
        return BonusMalus;
    }

    /**
     * @param BonusMalus the BonusMalus to set
     */
    public void setBonusMalus(int BonusMalus) {
        this.BonusMalus = BonusMalus;
    }

    /**
     * @return the conducteurSecondaire
     */
    public String getConducteurSecondaire() {
        return conducteurSecondaire;
    }

    /**
     * @param conducteurSecondaire the conducteurSecondaire to set
     */
    public void setConducteurSecondaire(String conducteurSecondaire) {
        this.conducteurSecondaire = conducteurSecondaire;
    }

    /**
     * @return the conducteurPrimaire
     */
    public String getConducteurPrimaire() {
        return conducteurPrimaire;
    }

    /**
     * @param conducteurPrimaire the conducteurPrimaire to set
     */
    public void setConducteurPrimaire(String conducteurPrimaire) {
        this.conducteurPrimaire = conducteurPrimaire;
    }

    public void nouveauSinistre(Date p_dateSinistre, String p_titreSinistre, String p_descriptionSinistre, String p_imageSinistre){
        mesSinistres[nbSinistres].setDateSinistre(p_dateSinistre);
        mesSinistres[nbSinistres].setTitreSinistre(p_titreSinistre);
        mesSinistres[nbSinistres].setDescriptionSinistre(p_descriptionSinistre);
        mesSinistres[nbSinistres].setImageSinistre(p_imageSinistre);
        nbSinistres++;
    }

    
}
