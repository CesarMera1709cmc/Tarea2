/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.eventofactory.EventoBaloncesto;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;
import ec.edu.espol.sportspredictor.eventofactory.EventoTennis;
import java.util.ArrayList;
import java.util.Random;

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
        this.eventos.forEach((evento) -> {
            System.out.println(evento.getTitulo());
        });
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
                evento = new EventoFutbol(nombres[n1], nombres[n2]);
                break;
            case 1:
                evento = new EventoTennis(nombres[n1], nombres[n2]);
                break;
            case 2:
                evento = new EventoBaloncesto(nombres[n1], nombres[n2]);
                break;
            default:
                evento = new EventoFutbol(nombres[n1], nombres[n2]);
                break;
        }
        
        agregarEvento(evento);
    }
    
    public static void main(String[] args) {
        SistemaApuestas self = SistemaApuestas.getSistema();
        
        for (int i = 0; i < 5; i++) {
            self.agregarEventoAleatorio();
        }
        
        self.mostrarEventosDisponibles();
    }
}
