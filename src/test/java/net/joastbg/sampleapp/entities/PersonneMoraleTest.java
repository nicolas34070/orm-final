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
public class PersonneMoraleTest {
    
    public PersonneMoraleTest() {
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
     * Test of getSiren method, of class PersonneMorale.
     */
    @Test
    public void testGetSiren() {
        System.out.println("getSiren");
        PersonneMorale instance = new PersonneMorale();
        String expResult = "";
        String result = instance.getSiren();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class PersonneMorale.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        PersonneMorale instance = new PersonneMorale();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }
}
