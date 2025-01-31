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

    


    public EventoDeportivo() {
    }

    public abstract Partido iniciarPartido();

    public abstract String getTitulo();
    
    public String getCategoria() {
        return this.categoria;
    };

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        if (resultado != null && !resultado.isEmpty()) {
            this.resultado = resultado;
        } else {
            throw new IllegalArgumentException("El resultado no puede ser nulo o vacío.");
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
