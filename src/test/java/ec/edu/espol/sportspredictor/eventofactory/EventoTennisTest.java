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
public class EventoTennisTest {
    
    public EventoTennisTest() {
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
        EventoTennis evento = new EventoTennis("Nadal", "Federer");
        assertEquals("Tennis Nadal vs Federer", evento.getTitulo());
    }

    @Test
    void testIniciarPartido() {
        EventoTennis evento = new EventoTennis("Nadal", "Federer");
        assertNotNull(evento.iniciarPartido());
    }

    @Test
    void testConstructorJugadorNull() {
        assertThrows(NullPointerException.class, () -> new EventoTennis("Nadal", null));
    }
    
}
