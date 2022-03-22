/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cris
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void rellenarLista(ArrayList <Integer> lista) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(10) + 1);
        }
    }
    public static void main(String[] args) {
        EjercicoPropuesto lista = new EjercicoPropuesto();
        ArrayList <Integer> lista2 = new ArrayList<>();
        rellenarLista(lista2);
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));  
        }
        int posi = lista.buscarPorPosicion(lista2, 2, 0);
        System.out.println("La posición donde se encuentra el 2 es: " + posi);
    }

}
