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
    private List<Client> listeClient;
    private List<Echeances> listeEchance;
    
    
    public List<Echeances> getEcheanceSixMois() throws ParseException {
        List<Echeances> getEcheance = new ArrayList<Echeances>();
        Date dateNow = new Date();
        
        for(Echeances e : listeEchance) {
            if(e.getEmissionFacture().getTime() >= dateNow.getTime() && e.getEmissionFacture().getTime() <= getSixMonths().getTime()) {
               getEcheance.add(e);
            }
        }
        return getEcheance;
    }
    
    public static Date getSixMonths() throws ParseException {
        Calendar cal = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        Date modifiedDate = formatter.parse(formatter.format(today));
        cal.setTime(modifiedDate);
        cal.add(Calendar.MONTH, 6);
        return cal.getTime();
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dateSouscription
     */
    public Date getDateSouscription() {
        return dateSouscription;
    }

    /**
     * @param dateSouscription the dateSouscription to set
     */
    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }

    /**
     * @return the dateAnniversaire
     */
    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    /**
     * @param dateAnniversaire the dateAnniversaire to set
     */
    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    /**
     * @return the emissionPrelevement
     */
    public Date getEmissionPrelevement() {
        return emissionPrelevement;
    }

    /**
     * @param emissionPrelevement the emissionPrelevement to set
     */
    public void setEmissionPrelevement(Date emissionPrelevement) {
        this.emissionPrelevement = emissionPrelevement;
    }
}
