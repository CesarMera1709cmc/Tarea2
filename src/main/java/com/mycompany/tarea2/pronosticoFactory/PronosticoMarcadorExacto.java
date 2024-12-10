/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.pronosticoFactory;

import com.mycompany.tarea2.NotificacionObserver.Observer;

/**
 *
 * @author cesar
 */
public class PronosticoMarcadorExacto extends PronosticoFactory implements StrategyPronostico{
    
    public PronosticoMarcadorExacto(String email, EventoDeportivo evento, Boolean estado, int PronosticoID, Observer[] observers) {
        super(email, evento, estado, PronosticoID, observers);
    }

    @Override
    public void calcularResultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
}
