/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor;

import ec.edu.espol.sportspredictor.apuesta.ApuestaStrategy;
import ec.edu.espol.sportspredictor.apuesta.StrategyBaloncesto;
import ec.edu.espol.sportspredictor.apuesta.StrategyFutbol;
import ec.edu.espol.sportspredictor.apuesta.StrategyTennis;
import ec.edu.espol.sportspredictor.eventofactory.EventoDeportivo;
import ec.edu.espol.sportspredictor.usuario.Cliente;
import java.util.ArrayList;

/**
 *
 * @author pakamijo
 */
public class ApuestasCliente {
    private Cliente cliente;
    private int id;
    private ArrayList<ApuestaStrategy> apuestas;

    public ApuestasCliente(Cliente cliente) {
        this.cliente = cliente;
        this.apuestas = new ArrayList<>();
        this.id = 1;
    }

    // Método modificado para recibir una estrategia ya creada
    public void agregarApuesta(ApuestaStrategy strategy) {
        this.apuestas.add(strategy);
    }

    // Getter para la lista de apuestas (opcional)
    public ArrayList<ApuestaStrategy> getApuestas() {
        return apuestas;
    }
    
}
