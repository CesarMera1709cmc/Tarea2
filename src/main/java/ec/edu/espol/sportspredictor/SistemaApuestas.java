/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
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
        crearEventosAleatorios(sistema.getGestorEventos());
        EventoDeportivo evento = seleccionarEvento(sistema.getGestorEventos(), sc);
        if (evento == null) return; 
        System.out.println("Has seleccionado " + evento.getTitulo());
        realizarApuesta(evento, apuestas, sc);
        simularPartido(evento);
    }

    private static Cliente registrarCliente(Scanner sc) {
        System.out.println("/registro de cuenta/");
        System.out.println("Ingresar nombre de usuario:");
        String nombre = sc.next();
        System.out.println("Ingresar correo:");
        String correo = sc.next();
        System.out.println("Ingresar cédula:");
        String cedula = sc.next();

        return new Cliente(nombre, correo, cedula);
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

    private static void realizarApuesta(EventoDeportivo evento, ApuestasCliente apuestas, Scanner sc) {
        ApuestaStrategy strategy = apuestas.crearApuesta(evento, 2.2);

        System.out.println("Opciones de apuesta:");
        strategy.mostrarOpciones();

        int seleccion = sc.nextInt();
        if (seleccion < 1 || seleccion > 2) return;

        switch (evento.getCategoria()) {
            case "futbol":
                StrategyFutbol f = (StrategyFutbol) strategy;
                if (seleccion == 1) f.apostarEquipo1(); else f.apostarEquipo2();
                break;
            case "tennis":
                StrategyTennis t = (StrategyTennis) strategy;
                if (seleccion == 1) t.apostarJugador1(); else t.apostarJugador2();
                break;
            case "baloncesto":
                StrategyBaloncesto b = (StrategyBaloncesto) strategy;
                if (seleccion == 1) b.apostarEquipo1(); else b.apostarEquipo2();
                break;
        }
    }

    private static void simularPartido(EventoDeportivo evento) {
        Partido p = evento.iniciarPartido();
        System.out.println("Ejecutando partido...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {}
        p.finalizar();

        Random r = new Random();
        if (r.nextInt(2) == 0) {
            System.out.println("¡Has acertado la apuesta!");
        } else {
            System.out.println("No has acertado la apuesta.");
        }
    }
}
