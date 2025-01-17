/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.pronosticoFactory;

import com.mycompany.tarea2.NotificacionObserver.Observer;
import com.mycompany.tarea2.Usuario.Cliente;

/**
 *
 * @author cesar
 */
public class ApuestaResultado extends ApuestaFactory implements StrategyPronostico{
    
    public ApuestaResultado(Cliente cliente, EventoDeportivo evento) {
        this.email = cliente.getCorreo( );
        this.evento = evento;
        this.estado = false;
    }
    @Override
    public void realizarPronostico() {
        System.out.println("Apuesta realizada para el evento:");
        this.estado = true;
    }

    @Override
    public void addObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularResultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
