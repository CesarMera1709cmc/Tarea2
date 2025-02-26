/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
import ec.edu.espol.sportspredictor.apuesta.EstadoApuesta;
import ec.edu.espol.sportspredictor.apuesta.StrategyBaloncesto;
import ec.edu.espol.sportspredictor.apuesta.StrategyFutbol;
import ec.edu.espol.sportspredictor.apuesta.StrategyTennis;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.Partido;
import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pakamijo
 */
//patron de singleton
public class SistemaApuestas {
    private static SistemaApuestas instance;
    private GestorEventos gestorEventos;
    private GestorClientes gestorClientes;

    private SistemaApuestas() {
        this.gestorEventos = new GestorEventos();
        this.gestorClientes = new GestorClientes();
    }

    public static SistemaApuestas getSistema() {
        if (instance == null) {
            instance = new SistemaApuestas();
        }
        return instance;
    }

    public GestorEventos getGestorEventos() {
        return gestorEventos;
    }

    public GestorClientes getGestorClientes() {
        return gestorClientes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaApuestas sistema = SistemaApuestas.getSistema();
    
        Cliente cliente = registrarCliente(sc);
        ApuestasCliente apuestas = sistema.getGestorClientes().registrarCliente(cliente);
        System.out.println("Bienvenido " + cliente.getNombre());
    
        // Crear eventos aleatorios
        crearEventosAleatorios(sistema.getGestorEventos());
    
        EventoDeportivo evento = seleccionarEvento(sistema.getGestorEventos(), sc);
        if (evento == null) return; // Salir si la selección es inválida
    
        System.out.println("Has seleccionado " + evento.getTitulo());
    
        ApuestaStrategy estrategia = realizarApuesta(evento, apuestas, sc);
    
        simularPartido(evento, estrategia);
    }

    static Cliente registrarCliente(Scanner sc) {
        System.out.println("/registro de cuenta/");
        System.out.println("Ingresar nombre de usuario:");
        String nombre = sc.next();

        return new Cliente(nombre, "ceanmera", "1314606995");
    }

    private static void crearEventosAleatorios(GestorEventos gestorEventos) {
        for (int i = 0; i < 5; i++) {
            gestorEventos.agregarEventoAleatorio();
        }
    }

    private static EventoDeportivo seleccionarEvento(GestorEventos gestorEventos, Scanner sc) {
        gestorEventos.mostrarEventosDisponibles();
        System.out.println("Selecciona un evento:");
        int i = sc.nextInt() - 1;

        if (i >= gestorEventos.getEventos().size() || i < 0) {
            System.out.println("Selección inválida");
            return null;
        }

        return gestorEventos.getEventos().get(i);
    }

    private static ApuestaStrategy realizarApuesta(EventoDeportivo evento, ApuestasCliente apuestas, Scanner sc) {
        ApuestaStrategy strategy = ApuestaFactory.crearApuesta(evento);
    
        System.out.println("Opciones de apuesta:");
        strategy.mostrarOpciones();
    
        int seleccion = sc.nextInt();
        if (seleccion < 1 || seleccion > 2) {
            System.out.println("Selección inválida. Saliendo...");
            return null;
        }
    
        // Configurar la apuesta según la selección del usuario
        strategy.configurarApuesta(seleccion);

        // Agregar la estrategia a la lista de apuestas del cliente
        apuestas.agregarApuesta(strategy);
    
        return strategy; // Devolver la estrategia creada
    }

    private static void simularPartido(EventoDeportivo evento, ApuestaStrategy estrategia) {
        Partido p = evento.iniciarPartido();
        System.out.println("Ejecutando partido...");
        try {
            TimeUnit.SECONDS.sleep(2); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.finalizar();
    
        Random r = new Random();
        boolean apuestaAcertada = r.nextBoolean(); // 50% de probabilidad de acertar
    
        if (apuestaAcertada) {
            estrategia.actualizarEstado(EstadoApuesta.ACERTADO);
        } else {
            estrategia.actualizarEstado(EstadoApuesta.FALLIDO);
        }
    
        System.out.println("Resultado del partido: " + (apuestaAcertada ? "¡Has ganado!" : "Has perdido."));
    }
}
