package net.joastbg.sampleapp.entities;




public class CompteBancaire {

    private String Iban;
    private String BIC;
    private String Proprietaire;
    
    /**
     * @return the Iban
     */
    public String getIban() {
        return Iban;
    }

    /**
     * @param Iban the Iban to set
     */
    public void setIban(String Iban) {
        this.Iban = Iban;
    }

    /**
     * @return the BIC
     */
    public String getBIC() {
        return BIC;
    }

    /**
     * @param BIC the BIC to set
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /**
     * @return the Proprietaire
     */
    public String getProprietaire() {
        return Proprietaire;
    }

    /**
     * @param Proprietaire the Proprietaire to set
     */
    public void setProprietaire(String Proprietaire) {
        this.Proprietaire = Proprietaire;
    }
}
