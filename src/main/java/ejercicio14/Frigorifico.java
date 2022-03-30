/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author Cris
 */
public class Frigorifico extends Electrodomestico implements Comparable<Frigorifico>, Silencioso {

    private double litros;

    public Frigorifico(double litros, double consumo, String modelo) {
        super(consumo, modelo);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "litros=" + litros + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("el frigorífico de modelo " + getModelo() + " emite 50dB");
    }

    public int compareTo(Frigorifico f) {
        return (int) (this.litros - f.getLitros());
    }
}
