/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cesar
 */
public class SistemaApuestasTest {
    private SistemaApuestas sistema;
    public SistemaApuestasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        sistema = SistemaApuestas.getSistema();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSistema method, of class SistemaApuestas.
     */
     
   @Test
    void testRegistrarCliente() {
        Cliente cliente = sistema.registrarCliente(new Scanner(System.in));
        assertEquals("Juan", cliente.getNombre());
    }

    @Test
    void testGetGestorEventos() {
        assertNotNull(sistema.getGestorEventos());
    }

    @Test
    void testGetGestorClientes() {
        assertNotNull(sistema.getGestorClientes());
    }
}
