/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.entities;

import java.util.Date;
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
public class EcheancesTest {
    
    public EcheancesTest() {
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
     * Test of impressionEcheancier method, of class Echeances.
     */
    @Test
    public void testImpressionEcheancier() {
        System.out.println("impressionEcheancier");
        Echeances instance = new Echeances();
        instance.impressionEcheancier();
    }

    /**
     * Test of getPrix method, of class Echeances.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Echeances instance = new Echeances();
        int expResult = 0;
        int result = instance.getPrix();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateEmission method, of class Echeances.
     */
    @Test
    public void testGetDateEmission() {
        System.out.println("getDateEmission");
        Echeances instance = new Echeances();
        Date expResult = null;
        Date result = instance.getDateEmission();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDatePaiement method, of class Echeances.
     */
    @Test
    public void testGetDatePaiement() {
        System.out.println("getDatePaiement");
        Echeances instance = new Echeances();
        Date expResult = null;
        Date result = instance.getDatePaiement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmissionFacture method, of class Echeances.
     */
    @Test
    public void testGetEmissionFacture() {
        System.out.println("getEmissionFacture");
        Echeances instance = new Echeances();
        Date expResult = null;
        Date result = instance.getEmissionFacture();
        assertEquals(expResult, result);
    }
}
