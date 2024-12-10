/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01ds.Usuario;

/**
 *
 * @author cesar
 */
public class ControlCalidad extends Usuario implements IControlIncidente{

    public ControlCalidad(String nombre, String correo, int cedula) {
        super(nombre, correo, cedula);
    }

    @Override
    public void gestionarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void escalarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void revisarIncidentes(Incidente indicente){
        
    }
    public void ajustarPuntuacion(Usuario usuario, int puntos ){
        
    }
}
