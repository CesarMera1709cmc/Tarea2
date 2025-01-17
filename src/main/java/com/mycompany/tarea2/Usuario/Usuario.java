/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2.Usuario;

/**
 *
 * @author cesar
 */
public class Usuario {
    protected String nombre;
    protected String correo;
    protected String cedula;

    public void iniciarSesion(String correo, String clave) {
        System.out.println("Inicio de sesión exitoso para: " + correo);
    }

    public void registrar(String correo, String clave) {
        System.out.println("Usuario registrado con correo: " + correo);
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
        
    }

    public Usuario(String nombre, String correo, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }
    
            
    
}
