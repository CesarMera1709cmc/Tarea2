/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2;

import com.mycompany.tarea2.Usuario.Cliente;
import com.mycompany.tarea2.Usuario.Puntos;
import com.mycompany.tarea2.pronosticoFactory.ApuestaResultado;
import com.mycompany.tarea2.pronosticoFactory.EventoDeportivo;
import java.sql.Date;

/**
 *
 * @author cesar
 */
public class Tarea2 {
        public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@gmail.com", "1234567890");
        System.out.println("Cliente creado: " + cliente.getNombre());

        // Crear evento deportivo
        EventoDeportivo futbol = new EventoDeportivo();
        futbol.setEquipo1("Barcelona");
        futbol.setEquipo2("Real Madrid");
        futbol.setFecha(new Date());
        futbol.setCategoria("Futbol");
        System.out.println("Evento creado: " + futbol.getEquipo1() + " vs " + futbol.getEquipo2());

        // Realizar apuesta
        ApuestaResultado apuesta = new ApuestaResultado(cliente, futbol);
        apuesta.realizarPronostico();

        // Mostrar puntos del cliente
        cliente.getMoneda().mostrarPuntos();

        // Canjear puntos
        cliente.canjearPuntos();
    }
    
}
