package ejerciciopropuesto;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cris
 */
public class EjercicoPropuesto {

    ArrayList<Integer> lista;

    public EjercicoPropuesto() {
        lista = new ArrayList<>();
    }

    
    public void rellenarLista() {
        for (int i = 0; i < 100; i++) {
            lista.add(i);
        }
    }

    public void buscarPorPosicion() {

        int indice = lista.indexOf(5);
        if (indice != -1) {
            System.out.println("La búsqueda está en el índice " + indice);
        } else {
            System.out.println("El elemento no existe");
        }
    }
}
