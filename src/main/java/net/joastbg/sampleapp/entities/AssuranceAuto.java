package net.joastbg.sampleapp.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssuranceAuto extends Assurance {

    private String Immatriculation;
    private int BonusMalus;
    private String conducteurPrimaire;
    private List<String> conducteurSecondaire;
    
    public AssuranceAuto(){
        conducteurSecondaire = new ArrayList<String>();
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
    public List<String> getConducteurSecondaire() {
        return conducteurSecondaire;
    }

    public void addConducteurSecondaire(String conducteurSecondaire) {
        this.conducteurSecondaire.add(conducteurSecondaire);
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

    public void addSinistre(String date, String titre, String descri, String image) {
        listeSinitre.add(new Sinistre(date, titre, descri, image));
    }
    
    public void resilierContrat() {
        this.contratResiliserAnniversaire = true;
    }
    
    public List<Client> getClientAnniversaireTroisMois() throws ParseException {
        List<Client> listeClientAnniversaire = new ArrayList<Client>();
        Date dateNow = new Date();
        
        for(Client c : this.listeClient) {
            
            long dateAnniversaire = c.getAssuranceAuto().getDateAnniversaire().getTime();
            
            if(dateAnniversaire >= dateNow.getTime() && dateAnniversaire <= getMonths(3).getTime()) {
                listeClientAnniversaire.add(c);
            }
        }
        
        return listeClientAnniversaire;
    }
}
