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
public class ContactTest {
    
    public ContactTest() {
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
     * Test of getType method, of class Contact.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValeur method, of class Contact.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getValeur();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMail method, of class Contact.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelephonePortable method, of class Contact.
     */
    @Test
    public void testGetTelephonePortable() {
        System.out.println("getTelephonePortable");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getTelephonePortable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTelephoneFixe method, of class Contact.
     */
    @Test
    public void testGetTelephoneFixe() {
        System.out.println("getTelephoneFixe");
        Contact instance = new Contact();
        String expResult = "";
        String result = instance.getTelephoneFixe();
        assertEquals(expResult, result);
    }
}
