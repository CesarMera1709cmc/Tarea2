package ec.edu.espol.sportspredictor.notificacion;

public class NotificacionTelegram implements Observer{

    @Override
public void actualizar(String mensaje) {
    System.out.println("Notificación por Telegram enviada: " + mensaje);
}
    
}
