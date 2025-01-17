/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.pronosticoFactory;

import com.mycompany.tarea2.Usuario.Cliente;
import java.util.List;

/**
 *
 * @author cesar
 */
public class PronosticoCliente {
    private Cliente cliente;
    private int pronosticosClienteId;
    private List<ApuestaFactory> pronosticos;

    public void actualizarPuntos() {
        System.out.println("Actualizando puntos para el cliente: " + cliente.getNombre());
    }
    
}
