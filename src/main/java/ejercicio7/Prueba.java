/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

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
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(new Cocinero("Comida española", "Antonio", "Fernández", "04690375P"));
        lista.add(new Cocinero("Comida española", "Antonio", "Fernández", "04690375P"));
        lista.add(new Camarero("Ayudante de camarero", "Antonio", "Fernández", "04690375P"));
        lista.add(new Camarero("Sumiller", "Antonio", "Fernández", "04690375P"));
        for (Trabajador trabajador : lista) {
            trabajador.cotizar();
        }
    }
}
