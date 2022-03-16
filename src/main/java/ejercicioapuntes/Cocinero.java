/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioapuntes;

/**
 *
 * @author cristina
 */
public class Cocinero extends Trabajador {
    protected String partida;

    public Cocinero(String partida, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.partida = partida;
    }

    public Cocinero(String partida) {
        this.partida = partida;
    }

    public Cocinero() {
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return "Cocinero{" + "partida=" + partida + '}';
    }
    
}
