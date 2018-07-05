package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String Type;
    private String Valeur;
    private String mail;
    private String telephonePortable;
    private String telephoneFixe;
    private List<Client> listeClient;

    public Contact() {
        listeClient = new ArrayList<Client>();
    }
    
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getValeur() {
        return Valeur;
    }

    public void setValeur(String Valeur) {
        this.Valeur = Valeur;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephonePortable() {
        return telephonePortable;
    }

    public void setTelephonePortable(String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }
}
