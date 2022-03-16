/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioapuntes;

/**
 *
 * @author cristina
 */
public class Camarero extends Trabajador {
    private String rango;

    public Camarero(String rango, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.rango = rango;
    }

    public Camarero(String rango) {
        this.rango = rango;
    }
    

    public Camarero() {
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCamarero{" + "rango=" + rango + '}';
    }
    
    
    
}
