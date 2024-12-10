/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01ds.Usuario;

/**
 *
 * @author cesar
 */
public class Admin extends Usuario implements IGestionarReglas{

    public Admin(String nombre, String correo, int cedula) {
        super(nombre, correo, cedula);
    }

    @Override
    public void configurarOpcionesPronostico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void gestionarReglasPuntuacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
