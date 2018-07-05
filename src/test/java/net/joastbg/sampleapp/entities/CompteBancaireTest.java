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
public class CompteBancaireTest {
    
    public CompteBancaireTest() {
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
     * Test of getIban method, of class CompteBancaire.
     */
    @Test
    public void testGetIban() {
        System.out.println("getIban");
        CompteBancaire instance = new CompteBancaire();
        String expResult = "FR7612548029980000000150086";
        String result = instance.getIban();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBIC method, of class CompteBancaire.
     */
    @Test
    public void testGetBIC() {
        System.out.println("getBIC");
        CompteBancaire instance = new CompteBancaire();
        String expResult = "612548029980000000150086";
        String result = instance.getBIC();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProprietaire method, of class CompteBancaire.
     */
    @Test
    public void testGetProprietaire() {
        System.out.println("getProprietaire");
        CompteBancaire instance = new CompteBancaire();
        Client expResult = null;
        Client result = instance.getProprietaire();
        assertEquals(expResult, result);
    }
}
