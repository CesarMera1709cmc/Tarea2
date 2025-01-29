/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
import ec.edu.espol.sportspredictor.apuesta.StrategyBaloncesto;
import ec.edu.espol.sportspredictor.apuesta.StrategyFutbol;
import ec.edu.espol.sportspredictor.apuesta.StrategyTennis;
import ec.edu.espol.sportspredictor.eventofactory.EventoBaloncesto;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;
import ec.edu.espol.sportspredictor.eventofactory.EventoTennis;
import ec.edu.espol.sportspredictor.eventofactory.Partido;
import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.ArrayList;
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
    private ArrayList<EventoDeportivo> eventos;
    private ArrayList<ApuestasCliente> apostadores;

    private SistemaApuestas() {
        this.eventos = new ArrayList();
        this.apostadores = new ArrayList();
        SistemaApuestas.instance = this;
    }
    
    public static SistemaApuestas getSistema() {
        if (instance == null) {
            instance = new SistemaApuestas();
        }
        return instance;
    }

    public void mostrarEventosDisponibles() {
        System.out.println("estos son los siguientes eventos disponibles:");
        
        for (int i = 0; i < this.eventos.size(); i++) {
            System.out.println(i+1 + ". " + this.eventos.get(i).getTitulo());
        }
    }
    
    public void agregarEvento(EventoDeportivo evento) {
        this.eventos.add(evento);
    }
    
    public void agregarEventoAleatorio() {
        Random random = new Random();
        String[] nombres = {"adrian", "ariel", "erick", "cesar"};
        int n1 = random.nextInt(nombres.length);
        int n2 = random.nextInt(nombres.length);
        
        EventoDeportivo evento;
        switch (random.nextInt(3)) {
            case 0:
                evento = new EventoFutbol(nombres[n1] + " FC", nombres[n2] + " FC");
                break;
            case 1:
                evento = new EventoTennis(nombres[n1], nombres[n2]);
                break;
            case 2:
                evento = new EventoBaloncesto(nombres[n1] + " Team", nombres[n2] + " Team");
                break;
            default:
                evento = new EventoFutbol(nombres[n1], nombres[n2]);
                break;
        }
        
        agregarEvento(evento);
    }
    
    public ApuestasCliente registrarCliente(Cliente cliente) {
        ApuestasCliente apuestas = new ApuestasCliente(cliente);
        this.apostadores.add(apuestas);
        return apuestas;
    }

    private static Cliente registrarCliente(Scanner sc) {
        System.out.println("/registro de cuenta/");
        System.out.println("ingresar nombre de usuario:");
        String nombre = sc.next();
        System.out.println("ingresar correo:");
        String correo = sc.next();
        System.out.println("ingresar cedula:");
        String cedula = sc.next();
    
        return new Cliente(nombre, correo, cedula);
    }

    private static void crearEventosAleatorios(SistemaApuestas sistema) {
        for (int i = 0; i < 5; i++) {
            sistema.agregarEventoAleatorio();
        }
    }
    private static EventoDeportivo seleccionarEvento(SistemaApuestas sistema, Scanner sc) {
        sistema.mostrarEventosDisponibles();
        System.out.println("selecciona un evento:");
        int i = sc.nextInt() - 1;
    
        if (i >= sistema.eventos.size() || i < 0) {
            System.out.println("seleccion invalida");
            return null;
        }
    
        return sistema.eventos.get(i);
    }
    private static void realizarApuesta(EventoDeportivo evento, ApuestasCliente apuestas, Scanner sc) {
        ApuestaStrategy strategy = apuestas.crearApuesta(evento, 2.2);
    
        System.out.println("opciones de apuesta:");
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
        System.out.println("ejecutando partido...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {}
        p.finalizar();
    
        Random r = new Random();
        if (r.nextInt(2) == 0) {
            System.out.println("has acertado la apuesta!");
        } else {
            System.out.println("no has acertado la apuesta.");
        }
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SistemaApuestas sistema = SistemaApuestas.getSistema();
    Cliente cliente = registrarCliente(sc);
    ApuestasCliente apuestas = sistema.registrarCliente(cliente);
    System.out.println("Bienvenido " + cliente.getNombre());
    crearEventosAleatorios(sistema);
    EventoDeportivo evento = seleccionarEvento(sistema, sc);
    if (evento == null) return; 
    System.out.println("has seleccionado " + evento.getTitulo());
    realizarApuesta(evento, apuestas, sc);
    simularPartido(evento);
}
}
