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
public class PersonnePhysiqueTest {
    
    public PersonnePhysiqueTest() {
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
     * Test of getNom method, of class PersonnePhysique.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        PersonnePhysique instance = new PersonnePhysique();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class PersonnePhysique.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        PersonnePhysique instance = new PersonnePhysique();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateNaissance method, of class PersonnePhysique.
     */
    @Test
    public void testGetDateNaissance() {
        System.out.println("getDateNaissance");
        PersonnePhysique instance = new PersonnePhysique();
        Date expResult = null;
        Date result = instance.getDateNaissance();
        assertEquals(expResult, result);
    }
}
