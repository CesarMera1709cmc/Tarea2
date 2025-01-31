/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;
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
public class GestorEventosTest {
    
    public GestorEventosTest() {
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
    void testAgregarEvento() {
        GestorEventos gestor = new GestorEventos();
        EventoFutbol evento = new EventoFutbol("Barcelona", "Real Madrid");
        gestor.agregarEvento(evento);
        assertEquals(1, gestor.getEventos().size());
    }

    @Test
    void testSeleccionarEventoInvalido() {
        GestorEventos gestor = new GestorEventos();
        assertNull(gestor.seleccionarEvento(5));
    }

    @Test
    void testAgregarEventoAleatorio() {
        GestorEventos gestor = new GestorEventos();
        gestor.agregarEventoAleatorio();
        assertEquals(1, gestor.getEventos().size());
    }
    
}
