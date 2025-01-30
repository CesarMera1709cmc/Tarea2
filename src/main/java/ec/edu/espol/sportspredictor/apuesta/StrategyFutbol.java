/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;

/**
 *
 * @author pakamijo
 */
public class StrategyFutbol extends ApuestaStrategy {
    private boolean apuestaEquipo1;

    public StrategyFutbol(EventoDeportivo e) {
        super(e);
    }

    @Override
    public void configurarApuesta(int opcionSeleccionada) {
        if (opcionSeleccionada == 1) {
            this.apostarEquipo1();
        } else {
            this.apostarEquipo2();
        }
    }

    public void apostarEquipo1() {
        apuestaEquipo1 = true;
    }

    public void apostarEquipo2() {
        apuestaEquipo1 = false;
    }

    @Override
public double calcularMonto() {
    if (apuestaEquipo1) {
        return 10.0; 
    } else {
        return 15.0; 
    }
}

    @Override
    public void mostrarOpciones() {
        EventoFutbol event = (EventoFutbol) this.getEvento();
        mostrarOpciones(event.getEquipo1(), event.getEquipo2()); 
    }
}
