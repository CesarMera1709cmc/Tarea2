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
public class StrategyFutbol extends ApuestaStrategy {
    private boolean seleccionEquipo1;

    public StrategyFutbol(EventoDeportivo e) {
        super(e);
    }
    
    public void apostarEquipo1() {
        seleccionEquipo1 = true;
    }

    public void apostarEquipo2() {
        seleccionEquipo1 = false;
    }

    @Override
    double calcularMonto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
