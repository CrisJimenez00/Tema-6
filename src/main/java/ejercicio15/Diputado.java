/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author cristina
 */
public class Diputado extends Legislador {

    private int numeroAsiento;

    public Diputado() {
    }

    public Diputado(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }

    @Override
    public String getCamara() {
        return "Es un diputado";
    }

}
