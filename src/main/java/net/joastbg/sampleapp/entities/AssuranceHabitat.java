package net.joastbg.sampleapp.entities;

import java.util.Date;

public class AssuranceHabitat extends Assurance {

    private String adresseAssure;
    private int valeurCouverture;
    
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
    
    public void addSinistre(String date, String titre, String descri) {
        listeSinitre.add(new Sinistre(date, titre, descri));
    }
    
    public void resilierContrat() {
        this.contratResiliserAnniversaire = true;
    }
}
