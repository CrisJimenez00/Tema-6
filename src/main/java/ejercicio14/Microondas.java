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
public class Microondas extends Electrodomestico implements Comparable<Microondas>, Silencioso {

    private double vatios;

    public Microondas(double vatios, double consumo, String modelo) {
        super(consumo, modelo);
        this.vatios = vatios;
    }

    public double getVatios() {
        return vatios;
    }

    public void setVatios(double vatios) {
        this.vatios = vatios;
    }

    @Override
    public String toString() {
        return "Microondas{" + "vatios=" + vatios + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El microondas de consumo " + getVatios() + " emite 40dB.");
    }

    @Override
    public int compareTo(Microondas m) {
        return (int) (this.vatios - m.getVatios());
    }

}
