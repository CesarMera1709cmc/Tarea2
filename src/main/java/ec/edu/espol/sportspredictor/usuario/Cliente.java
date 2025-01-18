/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.sportspredictor.usuario;

import ec.edu.espol.sportspredictor.Puntos;

/**
 *
 * @author pakamijo
 */
public class Cliente extends Usuario {
    private Puntos puntos;
    private int ranking;
    
    public Cliente() {
        super();
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    public void canjearPuntos() {
        System.out.println("canjeando puntos");
    }
}
