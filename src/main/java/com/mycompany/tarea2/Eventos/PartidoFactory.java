package com.mycompany.tarea2.Eventos;

public class PartidoFactory implements EventosFactory{

    @Override
    public Futbol crearFutbol() {
        return new PartidoFutbol();    
    }

    @Override
    public Baloncesto crearBaloncesto() {
        return new PartidoBaloncesto();    
    }

    @Override
    public Tennis crearTennis() {
        return new PartidoTennis();    
    }
    
}
