/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author cristina
 */
public class Profesor extends Persona {

    //Atributos
    private String especialidad;

    //Constructor
    public Profesor() {
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String especialidad, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.especialidad = especialidad;
    }

    //Getter y setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "especialidad=" + especialidad + '}';
    }

    //Método heredado
    @Override
    public void indetificate() {
        System.out.println("Soy un profesor con la especilidad: " + especialidad);
    }

}
