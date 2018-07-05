/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valentin
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFullName method, of class Client.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdentifiant method, of class Client.
     */
    @Test
    public void testGetIdentifiant() {
        System.out.println("getIdentifiant");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getIdentifiant();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCompteBancaire method, of class Client.
     */
    @Test
    public void testAddCompteBancaire() {
        System.out.println("addCompteBancaire");
        CompteBancaire c = null;
        Client instance = new Client();
        instance.addCompteBancaire(c);
    }

    /**
     * Test of genererEcheancierSixMois method, of class Client.
     */
    @Test
    public void testGenererEcheancierSixMois() throws Exception {
        System.out.println("genererEcheancierSixMois");
        Client instance = new Client();
        instance.genererEcheancierSixMois();
    }

    /**
     * Test of declarerSinistre method, of class Client.
     */
    @Test
    public void testDeclarerSinistre_3args() {
        System.out.println("declarerSinistre");
        String date = "";
        String titre = "";
        String descri = "";
        Client instance = new Client();
        instance.declarerSinistre(date, titre, descri);
    }

    /**
     * Test of declarerSinistre method, of class Client.
     */
    @Test
    public void testDeclarerSinistre_4args() {
        System.out.println("declarerSinistre");
        String date = "";
        String titre = "";
        String descri = "";
        String image = "";
        Client instance = new Client();
        instance.declarerSinistre(date, titre, descri, image);
    }

    /**
     * Test of resilierContratAuto method, of class Client.
     */
    @Test
    public void testResilierContratAuto() {
        System.out.println("resilierContratAuto");
        Client instance = new Client();
        instance.resilierContratAuto();
    }

    /**
     * Test of resilierContratHabitat method, of class Client.
     */
    @Test
    public void testResilierContratHabitat() {
        System.out.println("resilierContratHabitat");
        Client instance = new Client();
        instance.resilierContratHabitat();
    }

    /**
     * Test of getAssuranceAuto method, of class Client.
     */
    @Test
    public void testGetAssuranceAuto() {
        System.out.println("getAssuranceAuto");
        Client instance = new Client();
        AssuranceAuto expResult = null;
        AssuranceAuto result = instance.getAssuranceAuto();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAssuranceHabitat method, of class Client.
     */
    @Test
    public void testGetAssuranceHabitat() {
        System.out.println("getAssuranceHabitat");
        Client instance = new Client();
        AssuranceHabitat expResult = null;
        AssuranceHabitat result = instance.getAssuranceHabitat();
        assertEquals(expResult, result);
    }
}
