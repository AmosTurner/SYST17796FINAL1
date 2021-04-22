/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatenet;

import CalculateNet.CalculateNet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amost
 */
public class CalculateNetIT {
    
    public CalculateNetIT() {
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
     * Test of main method, of class FinalExam.
     */
    @Test
    public void testCalculateNet() {
        int hours = 30;
        int rate = 15;
        int tax = 58;
        CalculateNet test = new CalculateNet();
        int result = CalculateNet.calculateNet(hours, rate, tax);
        assertEquals(392, result);
    }
    
}




