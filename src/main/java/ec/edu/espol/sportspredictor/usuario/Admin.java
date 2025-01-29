/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.usuario;

import ec.edu.espol.sportspredictor.usuario.Usuario;

/**
 *
 * @author cesar
 */
public class Admin extends Usuario{

    public Admin(String nombre, String correo, String cedula) {
        super(nombre, correo, cedula);
    }

    public void configurarOpcionesPronostico() {
        System.out.println("Configurando opciones de pronóstico...");
    }

    public void gestionarReglasPuntuacion() {
        System.out.println("Gestionando reglas de puntuación...");
    }
}
