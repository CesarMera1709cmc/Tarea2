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
    public boolean jugador1;
    public StrategyTennis(EventoDeportivo e) {
        super(e);
    }

    @Override
    public void configurarApuesta(int seleccion) {
        if (seleccion == 1) {
            this.apostarJugador1();
        } else {
            this.apostarJugador2();
        }
    }

    public void apostarJugador1() {
        jugador1=true;
    }

    public void apostarJugador2() {
        jugador1=false;
    }

    @Override
    public double calcularMonto() {
        if (jugador1) {
            return 12.0; 
        } else {
            return 14.0; 
        }
    }

    @Override
    public void mostrarOpciones() {
        EventoTennis event = (EventoTennis) this.getEvento();
        mostrarOpciones(event.getJugador1(), event.getJugador2()); // Usa el método protegido de la superclase
    }
}