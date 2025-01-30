/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.apuesta;

import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoBaloncesto;

public class StrategyBaloncesto extends ApuestaStrategy {
    private boolean seleccionEquipo1;
    public StrategyBaloncesto(EventoDeportivo e) {
        super(e);
    }

    @Override
    public void configurarApuesta(int seleccion) {
        if (seleccion == 1) {
            this.apostarEquipo1();
        } else {
            this.apostarEquipo2();
        }
    }

    public void apostarEquipo1() {
        seleccionEquipo1 = true;
    }

    public void apostarEquipo2() {
        seleccionEquipo1 = false;
    }
    public double calcularMonto() {
        if (seleccionEquipo1) {
            return 10.0; 
        } else {
            return 15.0; 
        }
    }

    @Override
    public void mostrarOpciones() {
        EventoBaloncesto event = (EventoBaloncesto) this.getEvento();
        mostrarOpciones(event.getEquipo1(), event.getEquipo2()); 
}
}