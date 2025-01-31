/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pakamijo
 */
public class GestorClientesTest {
    
    public GestorClientesTest() {
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
     * Test of getApostadores method, of class GestorClientes.
     */
    @Test
    public void testGetApostadores() {
        System.out.println("getApostadores");
        GestorClientes instance = new GestorClientes();
        ArrayList<ApuestasCliente> expResult = null;
        ArrayList<ApuestasCliente> result = instance.getApostadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    void testRegistrarCliente() {
        GestorClientes gestor = new GestorClientes();
        Cliente cliente = new Cliente("Juan", "Juan@gmail.com", "095000000");
        gestor.registrarCliente(cliente);
        assertEquals(1, gestor.getApostadores().size());
    }

    @Test
    void testRegistrarClienteNull() {
        GestorClientes gestor = new GestorClientes();
        assertThrows(NullPointerException.class, () -> gestor.registrarCliente(null));
    }

    @Test
    void testGetApostadoresVacia() {
        GestorClientes gestor = new GestorClientes();
        assertTrue(gestor.getApostadores().isEmpty());
    }
    
}
