package net.joastbg.sampleapp.entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Client  {
    
    private int identifiant;
    private List<CompteBancaire> listeCompteBancaire;
    private Contact contact;
    private AssuranceAuto assuranceAuto;
    private AssuranceHabitat assuranceHabitat;

    private String fullName;
    
    public Client() {
        listeCompteBancaire = new ArrayList<CompteBancaire>();
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String s) {
        this.fullName = s;
    }
    
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    
    public void setComptePrincipale(CompteBancaire c) {
        if(listeCompteBancaire.contains(c)) {
            c.setIsProprietaire();
        }
    }
    
    public void addCompteBancaire(CompteBancaire c) {
        listeCompteBancaire.add(c);
    }
    
    public void genererEcheancierSixMois() throws ParseException {
        List<Echeances> listeEcheanceAuto = assuranceAuto.getEcheanceSixMois();
        for(Echeances e : listeEcheanceAuto) {
            e.impressionEcheancier();
        }
        
        List<Echeances> listeEcheanceHabitat = assuranceAuto.getEcheanceSixMois();
        for(Echeances e : listeEcheanceHabitat) {
            e.impressionEcheancier();
        }
    }
    
    public void declarerSinistre(String date, String titre, String descri) {
        assuranceHabitat.addSinistre(date, titre, descri);
    }
    
    public void declarerSinistre(String date, String titre, String descri, String image) {
        assuranceAuto.addSinistre(date, titre, descri, image);
    }
    
    public void resilierContratAuto() {
        assuranceAuto.resilierContrat();
    }
    
    public void resilierContratHabitat() {
        assuranceHabitat.resilierContrat();
    }
    
    public AssuranceAuto getAssuranceAuto() {
        return this.assuranceAuto;
    }
    
    public AssuranceHabitat getAssuranceHabitat() {
        return this.assuranceHabitat;
    }
}