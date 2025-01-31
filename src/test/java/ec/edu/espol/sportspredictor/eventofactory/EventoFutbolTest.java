/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor.eventofactory;

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
public class EventoFutbolTest {
    
    public EventoFutbolTest() {
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

   @Test
    void testGetTitulo() {
        EventoFutbol evento = new EventoFutbol("Barcelona", "Real Madrid");
        assertEquals("Futbol: Barcelona vs Real Madrid", evento.getTitulo());
    }

    @Test
    void testIniciarPartido() {
        EventoFutbol evento = new EventoFutbol("Barcelona", "Real Madrid");
        assertNotNull(evento.iniciarPartido());
    }

    @Test
    void testConstructorEquipoNull() {
        assertThrows(NullPointerException.class, () -> new EventoFutbol("Barcelona", null));
    }
    
}
