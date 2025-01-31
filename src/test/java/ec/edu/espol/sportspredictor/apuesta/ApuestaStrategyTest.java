/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.Partido;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class ApuestaStrategyTest {
    EventoDeportivo evento = new EventoDeportivo() {
        @Override
        public Partido iniciarPartido() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getTitulo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    public ApuestaStrategyTest() {
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
     * Test of actualizarEstado method, of class ApuestaStrategy.
     */
    @Test
    void testActualizarEstado() {
        // Arrange
        ApuestaStrategy apuesta;
        apuesta = new ApuestaStrategy(evento) {
            @Override
            public void configurarApuesta(int seleccion) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double calcularMonto() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mostrarOpciones() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        // Act
        apuesta.actualizarEstado(EstadoApuesta.ACERTADO);
        
        // Assert
        assertEquals(EstadoApuesta.ACERTADO, apuesta.getEstado(), 
            "El estado debería ser ACERTADO");
    }
    
    @Test
    void testNotificarEstadoAcertado() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
       
        ApuestaStrategy apuesta;
        apuesta = new ApuestaStrategy(evento) {
            @Override
            public void configurarApuesta(int seleccion) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double calcularMonto() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mostrarOpciones() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        // Act
        apuesta.actualizarEstado(EstadoApuesta.ACERTADO);
        
        // Assert
        String output = outputStream.toString();
        assertTrue(output.contains("El estado de la apuesta ha cambiado a: ACERTADO"));
        assertTrue(output.contains("¡Felicidades! Has ganado la apuesta."));
        
        // Restaurar System.out
        System.setOut(System.out);
    }
    
    @Test
    void testGetEvento() {
        // Arrange
        EventoDeportivo evento = new EventoDeportivo() {
            @Override
            public Partido iniciarPartido() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getTitulo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        evento.setCategoria("futbol");
        ApuestaStrategy apuesta;
        apuesta = new ApuestaStrategy(evento) {
            @Override
            public void configurarApuesta(int seleccion) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double calcularMonto() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mostrarOpciones() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        // Act
        EventoDeportivo eventoRecuperado = apuesta.getEvento();
        
        // Assert
        assertNotNull(eventoRecuperado, "El evento no debería ser null");
        assertEquals(evento, eventoRecuperado, 
            "El evento recuperado debería ser el mismo que se usó para crear la apuesta");
    }
    
}
