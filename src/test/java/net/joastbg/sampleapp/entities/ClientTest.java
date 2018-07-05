/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.joastbg.sampleapp.entities;

import java.util.List;
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
     * Test of getIdentifiant method, of class Client.
     */
    @Test
    public void testGetIdentifiant() {
        System.out.println("getIdentifiant");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getIdentifiant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentifiant method, of class Client.
     */
    @Test
    public void testSetIdentifiant() {
        System.out.println("setIdentifiant");
        int identifiant = 0;
        Client instance = new Client();
        instance.setIdentifiant(identifiant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of genererEcheancierSixMois method, of class Client.
     */
    @Test
    public void testGenererEcheancierSixMois() throws Exception {
        System.out.println("genererEcheancierSixMois");
        Client instance = new Client();
        instance.genererEcheancierSixMois();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeCompteBancaire method, of class Client.
     */
    @Test
    public void testGetListeCompteBancaire() {
        System.out.println("getListeCompteBancaire");
        Client instance = new Client();
        List<CompteBancaire> expResult = null;
        List<CompteBancaire> result = instance.getListeCompteBancaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListeCompteBancaire method, of class Client.
     */
    @Test
    public void testSetListeCompteBancaire() {
        System.out.println("setListeCompteBancaire");
        List<CompteBancaire> listeCompteBancaire = null;
        Client instance = new Client();
        instance.setListeCompteBancaire(listeCompteBancaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Client.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Client instance = new Client();
        Contact expResult = null;
        Contact result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact method, of class Client.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        Contact contact = null;
        Client instance = new Client();
        instance.setContact(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssurance method, of class Client.
     */
    @Test
    public void testGetAssurance() {
        System.out.println("getAssurance");
        Client instance = new Client();
        Assurance expResult = null;
        Assurance result = instance.getAssurance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssurance method, of class Client.
     */
    @Test
    public void testSetAssurance() {
        System.out.println("setAssurance");
        Assurance assurance = null;
        Client instance = new Client();
        instance.setAssurance(assurance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
