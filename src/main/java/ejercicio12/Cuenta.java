/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author cristina
 */
public abstract class Cuenta {

    private String numeroCC;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.numeroCC = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        if (numeroCC.length() == 20) {
            this.numeroCC = numeroCC;
        } else {
            this.numeroCC = RandomStringUtils.randomNumeric(20).toUpperCase();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCC=" + numeroCC + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double dinero);

}
