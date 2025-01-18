/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.sportspredictor.notificacion;

/**
 *
 * @author cesar
 */
public interface Sujeto {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
