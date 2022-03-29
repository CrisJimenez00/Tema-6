/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

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
        ArrayList<Legislador> lista = new ArrayList<>();
        lista.add(new Diputado(8, "Málaga", "Picoletos", "Jefazo", "Martinez"));
        lista.add(new Diputado(7, "Sevilla", "Oihane", "Paco", "Viñas"));
        lista.add(new Diputado(6, "Granada", "Guardiola", "Melania", "Guevara"));
        lista.add(new Senador(2500, "Jaén", "Jesuitas", "Ainhoa", "Botella"));
        lista.add(new Senador(1500, "Huelva", "Jesuitas", "Alfonso", "Torres"));
        lista.add(new Senador(3500, "Córdoba", "Jesuitas", "Florentino", "Gordillo"));
        for (Legislador legislador : lista) {
//            System.out.println(legislador.getCamara());
            System.out.println(legislador.toString());
            
        }
    }

}
