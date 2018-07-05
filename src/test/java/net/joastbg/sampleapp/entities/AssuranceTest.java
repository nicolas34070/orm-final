/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.entities;

import java.util.Date;
import java.util.List;
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
public class AssuranceTest {
    
    public AssuranceTest() {
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
     * Test of getEcheanceSixMois method, of class Assurance.
     */
    @Test
    public void testGetEcheanceSixMois() throws Exception {
        System.out.println("getEcheanceSixMois");
        Assurance instance = new Assurance();
        List<Echeances> expResult = null;
        List<Echeances> result = instance.getEcheanceSixMois();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumero method, of class Assurance.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Assurance instance = new Assurance();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateSouscription method, of class Assurance.
     */
    @Test
    public void testGetDateSouscription() {
        System.out.println("getDateSouscription");
        Assurance instance = new Assurance();
        Date expResult = null;
        Date result = instance.getDateSouscription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateAnniversaire method, of class Assurance.
     */
    @Test
    public void testGetDateAnniversaire() {
        System.out.println("getDateAnniversaire");
        Assurance instance = new Assurance();
        Date expResult = null;
        Date result = instance.getDateAnniversaire();
        assertEquals(expResult, result);
    }


    /**
     * Test of getEmissionPrelevement method, of class Assurance.
     */
    @Test
    public void testGetEmissionPrelevement() {
        System.out.println("getEmissionPrelevement");
        Assurance instance = new Assurance();
        Date expResult = null;
        Date result = instance.getEmissionPrelevement();
        assertEquals(expResult, result);
    }


    /**
     * Test of getListeEcheance method, of class Assurance.
     */
    @Test
    public void testGetListeEcheance() {
        System.out.println("getListeEcheance");
        Assurance instance = new Assurance();
        List<Echeances> expResult = null;
        List<Echeances> result = instance.getListeEcheance();
        assertEquals(expResult, result);
    }

    /**
     * Test of addListeEcheance method, of class Assurance.
     */
    @Test
    public void testAddListeEcheance() {
        System.out.println("addListeEcheance");
        Echeances e = null;
        Assurance instance = new Assurance();
        instance.addListeEcheance(e);
    }

    /**
     * Test of getMonths method, of class Assurance.
     */
    @Test
    public void testGetMonths() throws Exception {
        System.out.println("getMonths");
        int month = 0;
        Date expResult = null;
        Date result = Assurance.getMonths(month);
        assertEquals(expResult, result);
    }

    /**
     * Test of testResiliation method, of class Assurance.
     */
    @Test
    public void testTestResiliation() {
        System.out.println("testResiliation");
        Assurance instance = new Assurance();
        instance.testResiliation();
    }
}
