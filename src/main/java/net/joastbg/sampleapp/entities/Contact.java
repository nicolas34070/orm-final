package net.joastbg.sampleapp.entities;

public class Contact {
    private String Type;
    private String Valeur;
    private String mail;
    private String telephonePortable;
    private String telephoneFixe;

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Valeur
     */
    public String getValeur() {
        return Valeur;
    }

    /**
     * @param Valeur the Valeur to set
     */
    public void setValeur(String Valeur) {
        this.Valeur = Valeur;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the telephonePortable
     */
    public String getTelephonePortable() {
        return telephonePortable;
    }

    /**
     * @param telephonePortable the telephonePortable to set
     */
    public void setTelephonePortable(String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    /**
     * @return the telephoneFixe
     */
    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    /**
     * @param telephoneFixe the telephoneFixe to set
     */
    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }
}
