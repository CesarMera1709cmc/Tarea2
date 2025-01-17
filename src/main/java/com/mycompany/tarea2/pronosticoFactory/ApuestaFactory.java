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
public abstract class ApuestaFactory implements Sujeto{
    protected String email;
    protected EventoDeportivo evento;
    protected boolean estado;
    protected int pronosticoId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EventoDeportivo getEvento() {
        return evento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void realizarPronostico() {
        System.out.println("Realizando pronóstico...");
    }

    public void actualizarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado de la apuesta actualizado a: " + nuevoEstado);
    }

    public void notificar() {
        System.out.println("Notificando resultado...");
    }
    
}
