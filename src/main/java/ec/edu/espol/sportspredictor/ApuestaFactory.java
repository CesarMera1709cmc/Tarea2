package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
import ec.edu.espol.sportspredictor.apuesta.StrategyBaloncesto;
import ec.edu.espol.sportspredictor.apuesta.StrategyFutbol;
import ec.edu.espol.sportspredictor.apuesta.StrategyTennis;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;

public class ApuestaFactory {
    public static ApuestaStrategy crearApuesta(EventoDeportivo evento) {
        switch (evento.getCategoria()) {
            case "futbol":
                return new StrategyFutbol(evento);
            case "tennis":
                return new StrategyTennis(evento);
            case "baloncesto":
                return new StrategyBaloncesto(evento);
            default:
                throw new IllegalArgumentException("Tipo de apuesta no soportado");
        }
    }
}
