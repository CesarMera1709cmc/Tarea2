/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.eventofactory;

/**
 *
 * @author pakamijo
 */
public class EventoFutbol extends EventoDeportivo {
    private String equipo1;
    private String equipo2;
    
    public EventoFutbol(String e1, String e2) {
        equipo1 = e1;
        equipo2 = e2;
        this.categoria = "futbol";
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    
    
    @Override
    public PartidoFutbol iniciarPartido() {
        PartidoFutbol partido = new PartidoFutbol();
        partido.iniciar();
       return partido;
    }

    @Override
    public String getTitulo() {
        return "Futbol: " + equipo1 + " vs " + equipo2;
    }
    
}
