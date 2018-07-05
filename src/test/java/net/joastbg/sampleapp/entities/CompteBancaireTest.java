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
 * @author Nico
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
        instance.setIban("FR7612548029980000000150086");
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
        instance.setBIC("FR15ZSDZ");
        String expResult = "FR15ZSDZ";
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
        instance.setProprietaire("Nicolas");
        String expResult = "Nicolas";
        String result = instance.getProprietaire();
        assertEquals(expResult, result);
    }
    
}
