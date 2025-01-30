/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.eventofactory;

/**
 *
 * @author pakamijo
 */
public class EventoBaloncesto extends EventoDeportivo {

    private String equipo1;
    private String equipo2;

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public EventoBaloncesto(String e1, String e2) {
        equipo1 = e1;
        equipo2 = e2;
        this.setCategoria("baloncesto");
    }

    @Override
    public PartidoBaloncesto iniciarPartido() {
        PartidoBaloncesto partido = new PartidoBaloncesto();
        partido.iniciar();
        return partido;
    }

    @Override
    public String getTitulo() {
        return "Baloncesto: " + equipo1 + " vs " + equipo2;
    }
}
