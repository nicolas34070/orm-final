package net.joastbg.sampleapp.entities;


import java.text.ParseException;
import java.util.List;

public class Client  {

    private int identifiant;
    private List<CompteBancaire> listeCompteBancaire;
    private Contact contact;
    private Assurance assurance;
    
    /**
     * @return the identifiant
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    
    public void genererEcheancierSixMois() throws ParseException {
        List<Echeances> listeEcheance = getAssurance().getEcheanceSixMois();
        for(Echeances e : listeEcheance) {
            e.impressionEcheancier();
        }
    }

    /**
     * @return the listeCompteBancaire
     */
    public List<CompteBancaire> getListeCompteBancaire() {
        return listeCompteBancaire;
    }

    /**
     * @param listeCompteBancaire the listeCompteBancaire to set
     */
    public void setListeCompteBancaire(List<CompteBancaire> listeCompteBancaire) {
        this.listeCompteBancaire = listeCompteBancaire;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the assurance
     */
    public Assurance getAssurance() {
        return assurance;
    }

    /**
     * @param assurance the assurance to set
     */
    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }
    
}



