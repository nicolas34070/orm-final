package net.joastbg.sampleapp.entities;

public class PersonneMorale extends Client {

    /**
     * @return the Siren
     */
    public String getSiren() {
        return Siren;
    }

    /**
     * @param Siren the Siren to set
     */
    public void setSiren(String Siren) {
        this.Siren = Siren;
    }

    /**
     * @return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    private String Siren;
    private String Nom;
}
