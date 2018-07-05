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
public class SinistreTest {
    
    public SinistreTest() {
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
     * Test of getDateSinistre method, of class Sinistre.
     */
    @Test
    public void testGetDateSinistre() {
        System.out.println("getDateSinistre");
        Sinistre instance = null;
        String expResult = "";
        String result = instance.getDateSinistre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitreSinistre method, of class Sinistre.
     */
    @Test
    public void testGetTitreSinistre() {
        System.out.println("getTitreSinistre");
        Sinistre instance = null;
        String expResult = "";
        String result = instance.getTitreSinistre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescriptionSinistre method, of class Sinistre.
     */
    @Test
    public void testGetDescriptionSinistre() {
        System.out.println("getDescriptionSinistre");
        Sinistre instance = null;
        String expResult = "";
        String result = instance.getDescriptionSinistre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageSinistre method, of class Sinistre.
     */
    @Test
    public void testGetImageSinistre() {
        System.out.println("getImageSinistre");
        Sinistre instance = null;
        String expResult = "";
        String result = instance.getImageSinistre();
        assertEquals(expResult, result);
    }
}
