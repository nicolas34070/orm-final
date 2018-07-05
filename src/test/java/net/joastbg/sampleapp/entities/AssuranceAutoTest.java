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
 * @author Valentin
 */
public class AssuranceAutoTest {
    
    public AssuranceAutoTest() {
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
     * Test of getImmatriculation method, of class AssuranceAuto.
     */
    @Test
    public void testGetImmatriculation() {
        System.out.println("getImmatriculation");
        AssuranceAuto instance = new AssuranceAuto();
        String expResult = "";
        String result = instance.getImmatriculation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBonusMalus method, of class AssuranceAuto.
     */
    @Test
    public void testGetBonusMalus() {
        System.out.println("getBonusMalus");
        AssuranceAuto instance = new AssuranceAuto();
        int expResult = 0;
        int result = instance.getBonusMalus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConducteurSecondaire method, of class AssuranceAuto.
     */
    @Test
    public void testGetConducteurSecondaire() {
        System.out.println("getConducteurSecondaire");
        AssuranceAuto instance = new AssuranceAuto();
        List<String> expResult = null;
        List<String> result = instance.getConducteurSecondaire();
        assertEquals(expResult, result);
    }

    /**
     * Test of addConducteurSecondaire method, of class AssuranceAuto.
     */
    @Test
    public void testAddConducteurSecondaire() {
        System.out.println("addConducteurSecondaire");
        String conducteurSecondaire = "";
        AssuranceAuto instance = new AssuranceAuto();
        instance.addConducteurSecondaire(conducteurSecondaire);
    }

    /**
     * Test of getConducteurPrimaire method, of class AssuranceAuto.
     */
    @Test
    public void testGetConducteurPrimaire() {
        System.out.println("getConducteurPrimaire");
        AssuranceAuto instance = new AssuranceAuto();
        String expResult = "";
        String result = instance.getConducteurPrimaire();
        assertEquals(expResult, result);
    }

    /**
     * Test of addSinistre method, of class AssuranceAuto.
     */
    @Test
    public void testAddSinistre() {
        System.out.println("addSinistre");
        String date = "";
        String titre = "";
        String descri = "";
        String image = "";
        AssuranceAuto instance = new AssuranceAuto();
        instance.addSinistre(date, titre, descri, image);
    }

    /**
     * Test of resilierContrat method, of class AssuranceAuto.
     */
    @Test
    public void testResilierContrat() {
        System.out.println("resilierContrat");
        AssuranceAuto instance = new AssuranceAuto();
        instance.resilierContrat();
    }

    /**
     * Test of getClientAnniversaireTroisMois method, of class AssuranceAuto.
     */
    @Test
    public void testGetClientAnniversaireTroisMois() throws Exception {
        System.out.println("getClientAnniversaireTroisMois");
        AssuranceAuto instance = new AssuranceAuto();
        List<Client> expResult = null;
        List<Client> result = instance.getClientAnniversaireTroisMois();
        assertEquals(expResult, result);
    }
    
}
