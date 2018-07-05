/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.entities;

import java.util.Date;

/**
 *
 * @author Nico
 */
public class Sinistre {
    private String dateSinistre;
    private String titreSinistre;
    private String descriptionSinistre;
    private String imageSinistre;
    
    public Sinistre(String p_dateSinistre, String p_titreSinistre, String p_descriptionSinistre){
        setDateSinistre(p_dateSinistre);
        setTitreSinistre(p_titreSinistre);
        setDescriptionSinistre(p_descriptionSinistre);
    }
    
    public Sinistre(String p_dateSinistre, String p_titreSinistre, String p_descriptionSinistre, String p_imageSinistre){
        setDateSinistre(p_dateSinistre);
        setTitreSinistre(p_titreSinistre);
        setDescriptionSinistre(p_descriptionSinistre);
        setImageSinistre(p_imageSinistre);
    }

    /**
     * @return the dateSinistre
     */
    public String getDateSinistre() {
        return dateSinistre;
    }

    /**
     * @param dateSinistre the dateSinistre to set
     */
    public void setDateSinistre(String dateSinistre) {
        this.dateSinistre = dateSinistre;
    }

    /**
     * @return the titreSinistre
     */
    public String getTitreSinistre() {
        return titreSinistre;
    }

    /**
     * @param titreSinistre the titreSinistre to set
     */
    public void setTitreSinistre(String titreSinistre) {
        this.titreSinistre = titreSinistre;
    }

    /**
     * @return the descriptionSinistre
     */
    public String getDescriptionSinistre() {
        return descriptionSinistre;
    }

    /**
     * @param descriptionSinistre the descriptionSinistre to set
     */
    public void setDescriptionSinistre(String descriptionSinistre) {
        this.descriptionSinistre = descriptionSinistre;
    }

    /**
     * @return the imageSinistre
     */
    public String getImageSinistre() {
        return imageSinistre;
    }

    /**
     * @param imageSinistre the imageSinistre to set
     */
    public void setImageSinistre(String imageSinistre) {
        this.imageSinistre = imageSinistre;
    }
}
