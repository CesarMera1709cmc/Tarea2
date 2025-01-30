package ec.edu.espol.sportspredictor.notificacion;

public class NotificacionWhatsApp implements Observer{

    @Override
public void actualizar(String mensaje) {
    System.out.println("Notificación por WhatsApp enviada: " + mensaje);
}
    
}
