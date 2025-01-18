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

    public void notificarEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    };

     abstract double calcularMonto();

    public EventoDeportivo getEvento() {
        return evento;
    }

    public EstadoApuesta getEstado() {
        return estado;
    }

     
}
