/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;

/**
 *
 * @author pakamijo
 */
public abstract class ApuestaStrategy {
    int id;
    private EventoDeportivo evento;
    private EstadoApuesta estado;

    protected ApuestaStrategy(EventoDeportivo e) {
        evento = e;
        estado = EstadoApuesta.PENDIENTE;
    }

    public void actualizarEstado(EstadoApuesta nuevoEstado) {
        this.estado = nuevoEstado;
        this.notificarEstado();
    }

    public abstract void configurarApuesta(int seleccion);

    public void notificarEstado() {
        String mensaje = "El estado de la apuesta ha cambiado a: " + this.estado;
        System.out.println(mensaje);
    
        if (this.estado == EstadoApuesta.ACERTADO) {
            System.out.println("¡Felicidades! Has ganado la apuesta.");
        } else if (this.estado == EstadoApuesta.FALLIDO) {
            System.out.println("Lo siento, no has acertado la apuesta.");
        }
    
        
    }

    public abstract double calcularMonto();

    protected void mostrarOpciones(String opcion1, String opcion2) {
        System.out.println("1. " + opcion1 + " | 2. " + opcion2);
    }

    public abstract void mostrarOpciones();

    public EventoDeportivo getEvento() {
        return evento;
    }

    public EstadoApuesta getEstado() {
        return estado;
    }

     
}
