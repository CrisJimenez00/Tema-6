/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author cristina
 */
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente() {
        super();
    }

    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.interes = 1.5;
        this.saldoMin = saldoMin;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public void actualizarSaldo() {
        double saldoFinal;
        if (getSaldo() > 1000) {
            saldoFinal = getSaldo() + (getSaldoMin() * this.interes);
            setSaldo(saldoFinal);

        } else {
            saldoFinal = getSaldo() + (getSaldo() + this.interes);
            setSaldo(saldoFinal);

        }
    }

    @Override
    public void retirar(double dinero) {
        if (getSaldo() < (getSaldo() - dinero)) {
            setSaldo(getSaldo() - dinero);
        }else{
            System.out.println("No tiene saldo suficiente");
        }
    }
}
