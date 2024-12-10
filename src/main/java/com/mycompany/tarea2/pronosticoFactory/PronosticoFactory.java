/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.pronosticoFactory;

import com.mycompany.tarea2.NotificacionObserver.Observer;
import com.mycompany.tarea2.NotificacionObserver.Sujeto;

/**
 *
 * @author cesar
 */
public abstract class PronosticoFactory implements Sujeto{
    private String email;
    private EventoDeportivo evento;
    private Boolean estado;
    private int PronosticoID;
    private Observer[] observers;
    
    public void realizarPronostico(){};
    
    public void actualizarEstado(Boolean estado) {
        this.estado = estado;
    }
    public void notificarObservers(){}
    
    public PronosticoFactory(String email, EventoDeportivo evento, Boolean estado, int PronosticoID, Observer[] observers) {
        this.email = email;
        this.evento = evento;
        this.estado = estado;
        this.PronosticoID = PronosticoID;
        this.observers = observers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EventoDeportivo getEvento() {
        return evento;
    }

    public void setEvento(EventoDeportivo evento) {
        this.evento = evento;
    }

    public Boolean getEstado() {
        return estado;
    }

    

    public int getPronosticoID() {
        return PronosticoID;
    }

    public void setPronosticoID(int PronosticoID) {
        this.PronosticoID = PronosticoID;
    }

    public Observer[] getObservers() {
        return observers;
    }

    public void setObservers(Observer[] observers) {
        this.observers = observers;
    }
    
}
