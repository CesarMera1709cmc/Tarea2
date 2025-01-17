/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.Usuario;

/**
 *
 * @author cesar
 */
class Puntos {
    double moneda;

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public void mostrarPuntos() {
        System.out.println("Puntos disponibles: " + moneda);
    }
    
}
