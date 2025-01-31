/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.Partido;
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
public class StrategyTennisTest {
    
    public StrategyTennisTest() {
    }
       private StrategyFutbol strategy;
    private EventoDeportivo evento;
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        evento = new EventoDeportivo() {
            @Override
            public Partido iniciarPartido() {
            return null;
            }

            @Override
            public String getTitulo() {
            return null;
            }
        };
        strategy = new StrategyFutbol(evento);
    }
    
    @Test
    void testConfigurarApuestaValida() {
        // Test para opción 1
        strategy.configurarApuesta(1);
        assertTrue(strategy.apostarEquipo1(), "La apuesta al equipo 1 debería ser verdadera");
        
        // Test para opción 2
        strategy.configurarApuesta(2);
        assertFalse(strategy.apostarEquipo1(), "La apuesta al equipo 1 debería ser falsa");
    }

    @Test
    void testConfigurarApuestaInvalida() {
        // Test para valor mayor que 2
        assertThrows(IllegalArgumentException.class, () -> {
            strategy.configurarApuesta(3);
        }, "Debería lanzar excepción para opción 3");
        
        // Test para valor menor que 0
        assertThrows(IllegalArgumentException.class, () -> {
            strategy.configurarApuesta(-1);
        }, "Debería lanzar excepción para opción -1");
    }

    @Test
    void testConfigurarApuestaNula() {
        assertThrows(IllegalArgumentException.class, () -> {
            strategy.configurarApuesta(0);
        }, "Debería lanzar excepción para opción 0");
        
        // Verificar que el estado de la apuesta no ha cambiado
        assertEquals(EstadoApuesta.PENDIENTE, strategy.getEstado(), 
            "El estado debería permanecer PENDIENTE después de una apuesta inválida");
    }
    
}
