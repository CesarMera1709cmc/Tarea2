/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.usuario;

/**
 *
 * @author cesar
 */
public class Soporte extends Usuario implements IControlIncidente{

    public Soporte(String nombre, String correo, String cedula) {
        super(nombre, correo, cedula);
    }

    @Override
    public void gestionarReporte(Reporte reporte) {
        System.out.println("Soporte gestionando reporte: " + reporte.getStringReporte());
    }

    @Override
    public void escalarReporte() {
        System.out.println("Soporte escalando reporte...");
    }
    
}
