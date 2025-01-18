/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.eventofactory.EventoBaloncesto;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;
import ec.edu.espol.sportspredictor.eventofactory.EventoTennis;
import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
                evento = new EventoBaloncesto(nombres[n1] + " FC", nombres[n2] + " FC");
                break;
            default:
                evento = new EventoFutbol(nombres[n1], nombres[n2]);
                break;
        }
        
        agregarEvento(evento);
    }
    
    public void registrarCliente(Cliente cliente) {
        ApuestasCliente apuestas = new ApuestasCliente(cliente);
        this.apostadores.add(apuestas);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaApuestas self = SistemaApuestas.getSistema();
        
        System.out.println("/registro de cuenta/");
        System.out.println("ingresar nombre de usuario:");
        String nombre = sc.next();
        System.out.println("ingresar correo:");
        String correo = sc.next();
        System.out.println("ingresar cedula:");
        String cedula = sc.next();
        
        Cliente cliente = new Cliente(nombre, correo, cedula);
        self.registrarCliente(cliente);
        System.out.println("Bienvenido " + cliente.getNombre());
        
        
        
        for (int i = 0; i < 5; i++) {
            self.agregarEventoAleatorio();
        }
        
        self.mostrarEventosDisponibles();
        System.out.println("selecciona un evento:");
        int i = sc.nextInt() - 1;
        
        if (i >= self.eventos.size() || i < 0) {
            System.out.println("seleccion invalida");
            return;
        }
        
        EventoDeportivo evento = self.eventos.get(i);
        System.out.println("has seleccionado " + evento.getTitulo());
        
        
    }
}
