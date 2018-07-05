package net.joastbg.sampleapp.entities;

import java.util.Date;

public class AssuranceHabitat extends Assurance {

    private String adresseAssure;
    private int valeurCouverture;
    private Sinistre[] mesSinistres;
    private int nbSinistres;
    
    /**
     * @return the adresseAssure
     */
    public String getAdresseAssure() {
        return adresseAssure;
    }

    /**
     * @param adresseAssure the adresseAssure to set
     */
    public void setAdresseAssure(String adresseAssure) {
        this.adresseAssure = adresseAssure;
    }

    /**
     * @return the valeurCouverture
     */
    public int getValeurCouverture() {
        return valeurCouverture;
    }

    /**
     * @param valeurCouverture the valeurCouverture to set
     */
    public void setValeurCouverture(int valeurCouverture) {
        this.valeurCouverture = valeurCouverture;
    }
    
    public void nouveauSinistre(Date p_dateSinistre, String p_titreSinistre, String p_descriptionSinistre){
        mesSinistres[nbSinistres].setDateSinistre(p_dateSinistre);
        mesSinistres[nbSinistres].setTitreSinistre(p_titreSinistre);
        mesSinistres[nbSinistres].setDescriptionSinistre(p_descriptionSinistre);
        nbSinistres++;
    }
}
