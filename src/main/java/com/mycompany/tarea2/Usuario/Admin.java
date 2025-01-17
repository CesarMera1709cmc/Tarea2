/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.Usuario;

/**
 *
 * @author cesar
 */
public class Admin extends Usuario implements IGestionarReglas{

    public Admin(String nombre, String correo, String cedula) {
        super(nombre, correo, cedula);
    }

     @Override
    public void configurarOpcionesPronostico() {
        System.out.println("Configurando opciones de pronóstico...");
    }

    @Override
    public void gestionarReglasPuntuacion() {
        System.out.println("Gestionando reglas de puntuación...");
    }
}
