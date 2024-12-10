package com.mycompany.tarea2.Eventos;

public class EstadisticaFactory implements EventosFactory {

    @Override
    public Futbol crearFutbol() {
        return new FutbolEstadistica();    
    }

    @Override
    public Baloncesto crearBaloncesto() {
        return new BaloncestoEstadistica();
    }

    @Override
    public Tennis crearTennis() {
        return new TennisEstadistica();    
    }
    
}
