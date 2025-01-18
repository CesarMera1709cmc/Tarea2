/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.eventofactory;

/**
 *
 * @author pakamijo
 */
public class EventoTennis extends EventoDeportivo {
    private String jugador1;
    private String jugador2;
    
    public EventoTennis(String j1, String j2) {
        jugador1 = j1;
        jugador2 = j2;
        this.categoria = "tennis";
    }
    
    @Override
    public PartidoTennis iniciarPartido() {
        PartidoTennis partido = new PartidoTennis();
        partido.iniciar();
       return partido;
    }

    @Override
    public String getTitulo() {
        return "Tennis " + jugador1 + " vs " + jugador2;
    }
}
