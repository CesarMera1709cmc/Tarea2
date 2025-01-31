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
public class StrategyFutbolTest {
    
    public StrategyFutbolTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    
    @AfterEach
    public void tearDown() {
    }

   private StrategyFutbol strategy;
    private EventoDeportivo evento;

    @BeforeEach
    void setUp() {
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
        /**
         * ID: 101
         * Propósito: Probar que el método configurarApuesta funciona correctamente con entradas válidas.
         * Precondiciones: Instancia válida de StrategyFutbol con un evento de fútbol.
         * Entrada: seleccion=1
         * Salida: apuesta realizada correctamente.
         */
        strategy.configurarApuesta(1);
        assertTrue(strategy.apostarEquipo1());
         strategy.configurarApuesta(2);
        assertTrue(strategy.apostarEquipo1());
    }
     @Test
    void testConfigurarApuestaInvalida() {
        /**
         * ID: 102
         * Propósito: Validar que el método configurarApuesta maneja selecciones inválidas.
         * Entrada: seleccion=3
         * Salida: Excepción IllegalArgumentException.
         */
        assertThrows(IllegalArgumentException.class, () -> {
            strategy.configurarApuesta(3);
        });
    }
    void testConfigurarApuestaNula(){
        
    }
}
