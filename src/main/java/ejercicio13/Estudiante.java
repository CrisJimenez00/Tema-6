/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author cristina
 */
public class Estudiante extends Persona {

    //Atributos
    private String id;

    //Constructores
    public Estudiante() {
    }

    public Estudiante(String id) {
        this.id = id;
    }

    public Estudiante(String id, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.id = id;
    }

    //Getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "id=" + id + '}';
    }

    //método de la clase padre abstracta
    @Override
    public void indetificate() {
        System.out.println("Soy el alumno con id: " + id);
    }

}
