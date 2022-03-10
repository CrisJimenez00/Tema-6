/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author cristina
 */
public class Empleado extends Persona {

    private double salario;

    public Empleado() {
        super();
        this.salario = 900;
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "salario=" + salario + '}';
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
