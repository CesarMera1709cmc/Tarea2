/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01ds.Usuario;

/**
 *
 * @author cesar
 */
public class Usuario {
    protected String nombre;
    protected String correo;
    protected int cedula;
    public void iniciarSesion(String Clave){
        
    }
    public void registrar(String correo, String Clave){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Usuario(String nombre, String correo, int cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }
    
            
    
}
