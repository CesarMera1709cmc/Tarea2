/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoTennis;

/**
 *
 * @author pakamijo
 */
public class StrategyTennis extends ApuestaStrategy {

    public StrategyTennis(EventoDeportivo e) {
        super(e);
    }

    public void apostarJugador1() {}

    public void apostarJugador2() {}

    @Override
    public double calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mostrarOpciones() {
        EventoTennis event = (EventoTennis) this.getEvento();
        mostrarOpciones(event.getJugador1(), event.getJugador2()); // Usa el método protegido de la superclase
    }
}