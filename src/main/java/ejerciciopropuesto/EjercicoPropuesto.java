package ejerciciopropuesto;

import java.util.ArrayList;
import java.util.Random;

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

    public int buscarPorPosicion(ArrayList<Integer> lista, int elemento, int j) {
        if (j == lista.size() || lista.get(j) == elemento) {
            if (j == lista.size()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return buscarPorPosicion(lista, elemento, j + 1);
        }
    }
}
