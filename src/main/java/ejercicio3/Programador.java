/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author cristina
 */
public class Programador extends Persona {

    private TipoProgramador tipo;

    public Programador() {
        super();
        this.tipo = TipoProgramador.JUNIOR;
    }

    public Programador(TipoProgramador tipo, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.tipo = tipo;
    }

    public Programador(TipoProgramador tipo) {
        this.tipo = tipo;
    }

    public TipoProgramador getTipo() {
        return tipo;
    }

    public void setTipo(TipoProgramador tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgramador: Tipo=" + tipo;
    }

}
