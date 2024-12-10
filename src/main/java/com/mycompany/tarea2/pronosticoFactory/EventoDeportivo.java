package com.mycompany.tarea2.pronosticoFactory;



import java.sql.Date;

public abstract class EventoDeportivo {
    private int eventoId;
    private String equipo1;
    private String equipo2;
    private Date fecha;
    private String categoria;


    abstract public void mostrarEstadisticas();


    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int id) {
        this.eventoId = id;
    }
}
