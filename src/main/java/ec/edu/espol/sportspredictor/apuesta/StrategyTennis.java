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

    public void apostarJugador1() {
    }

    public void apostarJugador2() {
    }

    @Override
    public double calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarOpciones() {
        EventoTennis event = (EventoTennis)this.getEvento();
        System.out.println("1. " + event.getJugador1() + " | 2. " + event.getJugador2());
    }

}
