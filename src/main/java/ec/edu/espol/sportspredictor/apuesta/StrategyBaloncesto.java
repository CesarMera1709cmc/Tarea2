/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;

/**
 *
 * @author pakamijo
 */
public class StrategyBaloncesto extends ApuestaStrategy {

    public StrategyBaloncesto(EventoDeportivo e) {
        super(e);
    }
    
    public void apostarEquipo1() {}
    
    public void apostarEquipo2() {}
    
    @Override
    double calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
