/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author cristina
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro() {
        super();
    }

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void retirar(double dinero) {
        if ((getSaldo() - dinero) > 0 && getSaldo() > 0) {
            setSaldo(getSaldo() - dinero);

        }
    }

    @Override
    public void actualizarSaldo() {
        setSaldo((getSaldo() + (getSaldo() * interes)) - comisionAnual);

    }

}
