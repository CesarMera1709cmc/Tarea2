/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.usuario;

/**
 *
 * @author cesar
 */
public class ControlCalidad extends Usuario implements IControlIncidente{

    public ControlCalidad(String nombre, String correo, String cedula) {
        super(nombre, correo, cedula);
    }

     public void gestionarReporte(Reporte reporte) {
        System.out.println("Gestionando reporte: " + reporte.getStringReporte());
    }

    public void ajustarPuntuacion(Usuario usuario, int puntos) {
        System.out.println("Ajustando puntuación para usuario: " + usuario.getNombre());
    }

    @Override
    public void escalarReporte() {
        System.out.println("Escalando reporte a un nivel superior...");
    }
}
