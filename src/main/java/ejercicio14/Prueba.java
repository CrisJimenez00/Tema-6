/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cris
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear campanas
        Campana camp1 = new Campana(780, 970, "SSsamsung");
        Campana camp2 = new Campana(80, 90, "samsung");

        //Crear microondas
        Microondas micro1 = new Microondas(150, 70, "deskjet");
        Microondas micro2 = new Microondas(1750, 770, "deskjet23");
        Microondas micro3 = new Microondas(900, 70, "A2");
        Microondas micro4 = new Microondas(5000, 90, "A1");
        Microondas micro5 = new Microondas(3000, 31, "A3");

        //Crear frigorificos
        Frigorifico frigo1 = new Frigorifico(190, 170, "A56");
        Frigorifico frigo2 = new Frigorifico(90, 70, "A2");
        Frigorifico frigo3 = new Frigorifico(907, 70, "A2");
        Frigorifico frigo4 = new Frigorifico(506, 90, "A1");
        Frigorifico frigo5 = new Frigorifico(800, 31, "A3");

        //Arrays
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        ArrayList<Frigorifico> listaFrigo = new ArrayList<>();
        ArrayList<Microondas> listaMicro = new ArrayList<>();

        lista.add(camp1);
        lista.add(camp2);
        lista.add(micro1);
        lista.add(micro2);
        lista.add(frigo1);
        lista.add(frigo2);

        //Se añade a la lista de microondas
        listaMicro.add(micro3);
        listaMicro.add(micro4);
        listaMicro.add(micro5);

        //Se añade a la lista de frigorificos
        listaFrigo.add(frigo3);
        listaFrigo.add(frigo4);
        listaFrigo.add(frigo5);

        Collections.sort(listaMicro);
        for (Microondas micro : listaMicro) {
            System.out.println(micro.toString());
        }

        System.out.println("---------------------------");
        Collections.sort(listaFrigo);
        for (Frigorifico frigo : listaFrigo) {
            System.out.println(frigo.toString());
        }

        for (Electrodomestico aux : lista) {
            if (aux instanceof Microondas) {
                ((Microondas) aux).muestra();
            }
            if (aux instanceof Frigorifico) {
                ((Frigorifico) aux).muestra();
            }
            if (aux instanceof Campana) {
                System.out.println("soy una campana extractora no tengo el metodo mostrar");
            }

        }
    }

}
