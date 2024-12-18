/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.pronosticoFactory;

import com.mycompany.tarea2.Usuario.Cliente;

/**
 *
 * @author cesar
 */
public class PronosticoCliente {
    private PronosticoFactory[] pronosticos;
    private Cliente cliente;
    private int pronosticosClienteId;

    public PronosticoCliente(PronosticoFactory[] pronosticos, Cliente cliente, int pronosticosClienteId) {
        this.pronosticos = pronosticos;
        this.cliente = cliente;
        this.pronosticosClienteId = pronosticosClienteId;
    }

    public PronosticoFactory[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(PronosticoFactory[] pronosticos) {
        this.pronosticos = pronosticos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPronosticosClienteId() {
        return pronosticosClienteId;
    }

    public void setPronosticosClienteId(int pronosticosClienteId) {
        this.pronosticosClienteId = pronosticosClienteId;
    }
    
}
