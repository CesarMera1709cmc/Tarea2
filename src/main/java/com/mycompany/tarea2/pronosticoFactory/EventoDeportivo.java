package com.mycompany.tarea2.pronosticoFactory;




import com.mycompany.tarea2.Eventos.Evento;
import com.mycompany.tarea2.NotificacionObserver.Observer;
import com.mycompany.tarea2.NotificacionObserver.Sujeto;
import java.sql.Date;


public class EventoDeportivo implements Sujeto,Evento{
    private int eventoId;
    private Date fecha;
    private String categoria;
    private String Resultado;

    public int getEventoId() {
        return eventoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public void setEventoId(int id) {
        this.eventoId = id;
    }
    public void crearEventos() {
        System.out.println("Creando evento deportivo...");
    }

    @Override
    public void addObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
