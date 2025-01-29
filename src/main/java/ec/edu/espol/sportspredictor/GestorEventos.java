package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.eventofactory.EventoBaloncesto;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.eventofactory.EventoFutbol;
import ec.edu.espol.sportspredictor.eventofactory.EventoTennis;

import java.util.ArrayList;
import java.util.Random;

public class GestorEventos {
    private ArrayList<EventoDeportivo> eventos;

    public GestorEventos() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(EventoDeportivo evento) {
        this.eventos.add(evento);
    }

    public void agregarEventoAleatorio() {
        Random random = new Random();
        String[] nombres = {"adrian", "ariel", "erick", "cesar"};
        int n1 = random.nextInt(nombres.length);
        int n2 = random.nextInt(nombres.length);

        EventoDeportivo evento;
        switch (random.nextInt(3)) {
            case 0:
                evento = new EventoFutbol(nombres[n1] + " FC", nombres[n2] + " FC");
                break;
            case 1:
                evento = new EventoTennis(nombres[n1], nombres[n2]);
                break;
            case 2:
                evento = new EventoBaloncesto(nombres[n1] + " Team", nombres[n2] + " Team");
                break;
            default:
                evento = new EventoFutbol(nombres[n1], nombres[n2]);
                break;
        }

        agregarEvento(evento);
    }

    public void mostrarEventosDisponibles() {
        System.out.println("Estos son los siguientes eventos disponibles:");
        for (int i = 0; i < this.eventos.size(); i++) {
            System.out.println((i + 1) + ". " + this.eventos.get(i).getTitulo());
        }
    }

    public EventoDeportivo seleccionarEvento(int indice) {
        if (indice >= 0 && indice < eventos.size()) {
            return eventos.get(indice);
        }
        return null;
    }

    public ArrayList<EventoDeportivo> getEventos() {
        return eventos;
    }
}