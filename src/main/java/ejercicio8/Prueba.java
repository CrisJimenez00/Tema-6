/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Azar> lista = new ArrayList<>();
        lista.add(new Dado());
        lista.add(new Dado());
        lista.add(new Moneda());
        lista.add(new Moneda());
        for (Azar azar : lista) {
            System.out.println("El número salido es: " + azar.lanzar());
        }
       
    }
    
}
