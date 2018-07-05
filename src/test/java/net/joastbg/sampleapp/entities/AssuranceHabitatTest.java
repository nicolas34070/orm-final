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
public class AssuranceHabitatTest {
    
    public AssuranceHabitatTest() {
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
     * Test of getAdresseAssure method, of class AssuranceHabitat.
     */
    @Test
    public void testGetAdresseAssure() {
        System.out.println("getAdresseAssure");
        AssuranceHabitat instance = new AssuranceHabitat();
        String expResult = "";
        String result = instance.getAdresseAssure();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValeurCouverture method, of class AssuranceHabitat.
     */
    @Test
    public void testGetValeurCouverture() {
        System.out.println("getValeurCouverture");
        AssuranceHabitat instance = new AssuranceHabitat();
        int expResult = 0;
        int result = instance.getValeurCouverture();
        assertEquals(expResult, result);
    }

    /**
     * Test of addSinistre method, of class AssuranceHabitat.
     */
    @Test
    public void testAddSinistre() {
        System.out.println("addSinistre");
        String date = "";
        String titre = "";
        String descri = "";
        AssuranceHabitat instance = new AssuranceHabitat();
        instance.addSinistre(date, titre, descri);
    }

    /**
     * Test of resilierContrat method, of class AssuranceHabitat.
     */
    @Test
    public void testResilierContrat() {
        System.out.println("resilierContrat");
        AssuranceHabitat instance = new AssuranceHabitat();
        instance.resilierContrat();
    }
    
}
