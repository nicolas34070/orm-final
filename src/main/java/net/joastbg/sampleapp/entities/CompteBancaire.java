package net.joastbg.sampleapp.entities;

public class CompteBancaire {

    private String Iban;
    private String BIC;
    private Client Proprietaire;
    private boolean isPrincipale = false;
   
    public CompteBancaire() {
        
    }
    
    public String getIban() {
        return Iban;
    }

    public void setIban(String Iban) {
        this.Iban = Iban;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    public Client getProprietaire() {
        return Proprietaire;
    }

    public void setProprietaire(String p) {
        //for(Client c : listeClient) {
            //if(p == c.getFullName()) {
                //c.addCompteBancaire(this);
            //}
        //}
    }
    
    public void setIsProprietaire() {
        this.isPrincipale = true;
    }
}
