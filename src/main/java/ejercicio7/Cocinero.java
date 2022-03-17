/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author cristina
 */
public class Cocinero extends Trabajador {

    private String especialidad;

    public Cocinero(String especialidad, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.especialidad = especialidad;
    }

    public void cocinar() {
        System.out.println("Está cocinando.");
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizando como Cocinero");
    }

}
