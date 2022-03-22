/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author cristina
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", "09117854P", 18);
        Persona p2 = new Persona("Antonia", "09117857K", 20);
        Cuenta cc1 = new CuentaCorriente();
        Cuenta ca1 = new CuentaAhorro();
        
        System.out.println("CUENTA CORRIENTE");
        System.out.println(cc1.getSaldo());
        cc1.setSaldo(500);
        System.out.println(cc1.getSaldo());
        cc1.retirar(100000);
        cc1.actualizarSaldo();
        System.out.println(cc1.getSaldo());
        
        System.out.println("\nCUENTA DE AHORRO");
        System.out.println(ca1.getSaldo());
        ca1.setSaldo(500);
        System.out.println(ca1.getSaldo());
        ca1.retirar(100000);
        ca1.actualizarSaldo();
        System.out.println(ca1.getSaldo());
    }
    
}
