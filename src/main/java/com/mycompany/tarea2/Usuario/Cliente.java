/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea01ds.Usuario;

/**
 *
 * @author cesar
 */
public class Cliente extends Usuario{
    private double puntos;
    private int ranking;
    
    public Reporte reportar(String queja){
        return null;
    }
    public void  actualizarPuntos(){
        
    }
    public void canjearPuntos(){
        
    }
    
    public Cliente(String nombre, String correo, int cedula) {
        super(nombre, correo, cedula);
    }
    
    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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

    public Cliente(double puntos, int ranking, String nombre, String correo, int cedula) {
        super(nombre, correo, cedula);
        this.puntos = puntos;
        this.ranking = ranking;
    }
    
}
