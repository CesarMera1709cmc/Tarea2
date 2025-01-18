/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.eventofactory;

import java.time.LocalDateTime;

/**
 *
 * @author pakamijo
 */
public abstract class EventoDeportivo {
    private int id;
    private LocalDateTime fecha;
    private String categoria;
    private String resultado;
    
    public abstract Partido iniciarPartido();
    
    public abstract String getTitulo();
}
