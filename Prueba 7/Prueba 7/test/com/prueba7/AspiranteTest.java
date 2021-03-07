/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba7;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Suite;

/**
 *
 * @author Murilo
 */
public class AspiranteTest {
    
    
    public AspiranteTest() {
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
    
    @Test
    public void testVerificar() {
        try {
            assertTrue(Aspirante.Verificar(20));
        } catch (Exception ex) {
            fail("Error");
        }
    }
    
    @Test
    public void testVerificarMenor() {
        try {
            assertFalse( Aspirante.Verificar(7));
        } catch (Exception ex) {
            fail("Error");
        }
    }
    
    @Test
    public void testVerificarMayor() {
        try {
            assertFalse(Aspirante.Verificar(47));
        } catch (Exception ex) {
            fail("Error");
        }
    }
    
    @Test
    public void testVerificarLimits() {
        try {
            assertTrue(Aspirante.Verificar(40));
            assertTrue(Aspirante.Verificar(18));
        } catch (Exception ex) {
            fail("Error");
        }
    }
    
    @Test
    public void testVerificarError() {
        
        try {
            assertFalse( Aspirante.Verificar(-7) );
            fail("Debe tener error");
        } catch (Exception ex) {
            
        }
    }
    
    
    @Test
    public void testNivelAcceso1() {
        assertEquals(1, Aspirante.NivelAcceso(true, true, false), 0.01);
        assertEquals(1, Aspirante.NivelAcceso(true, true, true), 0.01);
    }
    @Test
    public void testNivelAcceso2() {
        assertEquals(2, Aspirante.NivelAcceso(false, true, true), 0.01);
        assertEquals(2, Aspirante.NivelAcceso(true, false, true), 0.01);
        assertEquals(2, Aspirante.NivelAcceso(false, false, true), 0.01);
    }
    @Test
    public void testNivelAcceso3() {
        assertEquals(3, Aspirante.NivelAcceso(false, true, false), 0.01);
        assertEquals(3, Aspirante.NivelAcceso(true, false, false), 0.01);
        assertEquals(3, Aspirante.NivelAcceso(false, false, false), 0.01);
    }
    
}
