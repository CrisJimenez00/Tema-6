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
public class CampanaExtractora extends Electrodomestico {

    private double decibelios;

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios > 50) {
            this.decibelios = decibelios;
        }
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        if (decibelios > 50) {
            this.decibelios = decibelios;
        }
    }

    @Override
    public String toString() {
        return "Campana{" + "decibelios=" + decibelios + '}';
    }

}
