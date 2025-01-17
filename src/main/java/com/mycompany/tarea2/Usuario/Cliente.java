/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.Usuario;

/**
 *
 * @author cesar
 */
public class Cliente extends Usuario{
    private Puntos moneda;
    private int ranking;

    public Cliente(String nombre, String correo, String cedula) {
        super(nombre, correo, cedula);
    }

    

    public void canjearPuntos() {
        System.out.println("Puntos canjeados por el cliente: " + nombre);
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void reportar(String queja) {
        System.out.println("Cliente " + nombre + " reportó: " + queja);
    }

    public Puntos getMoneda() {
        return moneda;
    }
    
}
