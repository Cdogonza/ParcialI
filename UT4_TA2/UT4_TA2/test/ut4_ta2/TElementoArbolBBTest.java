/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ut4_ta2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class TElementoArbolBBTest {
    
    public TElementoArbolBBTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEtiqueta method, of class TElementoArbolBB.
     */
    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        TElementoArbolBB instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoIzq method, of class TElementoArbolBB.
     */
    @Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        TElementoArbolBB instance = null;
        TElementoArbolBB expResult = null;
        TElementoArbolBB result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoDer method, of class TElementoArbolBB.
     */
    @Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        TElementoArbolBB instance = null;
        TElementoArbolBB expResult = null;
        TElementoArbolBB result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoIzq method, of class TElementoArbolBB.
     */
    @Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        TElementoArbolBB instance = null;
        instance.setHijoIzq(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoDer method, of class TElementoArbolBB.
     */
    @Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        TElementoArbolBB instance = null;
        instance.setHijoDer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TElementoArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        TElementoArbolBB expResult = null;
        TElementoArbolBB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TElementoArbolBB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TElementoArbolBB instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TElementoArbolBB.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class TElementoArbolBB.
     */
    @Test
    public void testGetDatos() {
        System.out.println("getDatos");
        TElementoArbolBB instance = null;
        Object expResult = null;
        Object result = instance.getDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TElementoArbolBB.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        TElementoArbolBB expResult = null;
        TElementoArbolBB result = instance.eliminar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTamaño method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerTamaño() {
        System.out.println("obtenerTama\u00f1o");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.obtenerTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TElementoArbolBB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
