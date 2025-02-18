/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.intervalos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juanma
 */
public class IntervalosTest {
    
    public IntervalosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   
   

    /**
     * Test of main method, of class Intervalos.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Intervalos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ObtenerCategoria method, of class Intervalos.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerCategoria() {
        System.out.println("ObtenerCategoria");
        int a = -5;
        String expResult = "RangoA";
        String result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult, result);

        a = 5;
        expResult = "Rango B";
        result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult,result);
        
        a = 9;
        expResult = "Rango C";
        result = Intervalos.ObtenerCategoria(a);
        assertEquals(expResult,result);
        
    }
    
}
