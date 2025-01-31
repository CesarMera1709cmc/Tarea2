/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
import ec.edu.espol.sportspredictor.apuesta.StrategyFutbol;
import ec.edu.espol.sportspredictor.apuesta.StrategyTennis;
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
public class ApuestaFactoryTest {
    
    public ApuestaFactoryTest() {
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
     * Test of crearApuesta method, of class ApuestaFactory.
     */
    @Test
    void testCrearApuestaFutbol() {
        // Arrange
        EventoDeportivo eventoFutbol = new EventoDeportivo() {
            @Override
            public Partido iniciarPartido() {
                return null;
            }

            @Override
            public String getTitulo() {
                return null;
            }
        };
        eventoFutbol.setCategoria("futbol");
        
        // Act
        ApuestaStrategy apuesta = ApuestaFactory.crearApuesta(eventoFutbol);
        
        // Assert
        assertNotNull(apuesta, "La apuesta no debería ser null");
        assertTrue(apuesta instanceof StrategyFutbol, 
            "La apuesta debería ser una instancia de StrategyFutbol");
        System.out.println("La apuesta creada no es nula");
    }
    
    @Test
    void testCrearApuestaTennis() {
        // Arrange
        EventoDeportivo eventoTennis = new EventoDeportivo() {
            @Override
            public Partido iniciarPartido() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getTitulo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        eventoTennis.setCategoria("tennis");
        
        // Act
        ApuestaStrategy apuesta = ApuestaFactory.crearApuesta(eventoTennis);
        
        // Assert
        assertNotNull(apuesta, "La apuesta no debería ser null");
        assertTrue(apuesta instanceof StrategyTennis, 
            "La apuesta debería ser una instancia de StrategyTennis");
         System.out.println("La apuesta creada no es nula");
    }
    
    @Test
    void testCrearApuestaInvalida() {
        // Arrange
        EventoDeportivo eventoInvalido = new EventoDeportivo() {
            @Override
            public Partido iniciarPartido() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getTitulo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        eventoInvalido.setCategoria("ajedrez");
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> ApuestaFactory.crearApuesta(eventoInvalido),
            "Debería lanzar IllegalArgumentException para categorías no soportadas"
        );
        
        assertEquals("Tipo de apuesta no soportado", exception.getMessage(),
            "El mensaje de la excepción no coincide con el esperado");
    }
    
}
