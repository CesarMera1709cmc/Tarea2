/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.usuario;

/**
 *
 * @author pakamijo
 */
public abstract class Usuario {
    private String cedula;
    private String nombre;
    private String correo;
    private boolean enlinea;
    
    public Usuario(String nombre, String correo, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }
    
    public void iniciarSesion(String password) {
        System.out.println("sesion iniciada");
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
