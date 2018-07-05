package net.joastbg.sampleapp.entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Assurance {
    
    private int numero;
    private Date dateSouscription;
    private Date dateAnniversaire;
    private Date emissionPrelevement;
    protected List<Client> listeClient;
    private List<Echeances> listeEchance;
    protected List<Sinistre> listeSinitre;
    private boolean contratResilier = false;
    protected boolean contratResiliserAnniversaire = false;
    
    public List<Echeances> getEcheanceSixMois() throws ParseException {
        List<Echeances> getEcheance = new ArrayList<Echeances>();
        Date dateNow = new Date();
        
        for(Echeances e : listeEchance) {
            if(e.getEmissionFacture().getTime() >= dateNow.getTime() && e.getEmissionFacture().getTime() <= getMonths(6).getTime()) {
               getEcheance.add(e);
            }
        }
        return getEcheance;
    }
    
    public static Date getMonths(int month) throws ParseException {
        Calendar cal = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        Date modifiedDate = formatter.parse(formatter.format(today));
        cal.setTime(modifiedDate);
        cal.add(Calendar.MONTH, month);
        return cal.getTime();
    }
    
    public Assurance() {
        listeClient = new ArrayList<Client>();
        listeSinitre = new ArrayList<Sinistre>();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateSouscription() {
        return dateSouscription;
    }

    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public Date getEmissionPrelevement() {
        return emissionPrelevement;
    }

    public void setEmissionPrelevement(Date emissionPrelevement) {
        this.emissionPrelevement = emissionPrelevement;
    }
    
    public List<Echeances> getListeEcheance() {
        return this.listeEchance;
    }

    public void addListeEcheance(Echeances e) {
        this.listeEchance.add(e);
    }
    
    public void testResiliation() {
        if(contratResiliserAnniversaire) {
            Date dateNow = new Date();
            
            if(dateNow.getTime() <= dateAnniversaire.getTime()) {
                this.contratResilier = true;
            }
        }
    }
}
