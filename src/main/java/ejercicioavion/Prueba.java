/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioavion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Cris
 */
public class Prueba {

    public static void main(String[] args) {
        //Hacemos la lista de pasajeros primero
        ArrayList<Persona> pasajerosVuelo1 = new ArrayList<>();
        ArrayList<Persona> pasajerosVuelo2 = new ArrayList<>();
        ArrayList<Persona> pasajerosVuelo3 = new ArrayList<>();
        ArrayList<Persona> pasajerosVuelo4 = new ArrayList<>();
        ArrayList<Persona> pasajerosVuelo5 = new ArrayList<>();

        //Añadimos 16 personas;
        //para el vuelo1
        pasajerosVuelo1.add(new Persona("Melania", "Bernabeu", new NIF("28369479", LocalDate.now())));
        pasajerosVuelo1.add(new Persona("Salma", "Cañas", new NIF("58693110", LocalDate.now())));
        pasajerosVuelo1.add(new Persona("Francesc", "Andreu", new NIF("98357041", LocalDate.now())));
        //Para el vuelo2
        pasajerosVuelo2.add(new Persona("Coral", "Pons", new NIF("30599411", LocalDate.now())));
        pasajerosVuelo2.add(new Persona("Christopher", "Gallego", new NIF("72975056", LocalDate.now())));
        pasajerosVuelo2.add(new Persona("Ainoa", "Carrera", new NIF("82680008", LocalDate.now())));
        //Para el vuelo3
        pasajerosVuelo3.add(new Persona("Raul", "Camino", new NIF("18837080", LocalDate.now())));
        pasajerosVuelo3.add(new Persona("Xavier", "Brito", new NIF("88869604", LocalDate.now())));
        pasajerosVuelo3.add(new Persona("Yolanda", "Gamero", new NIF("57088957", LocalDate.now())));
        //Para el vuelo4
        pasajerosVuelo4.add(new Persona("Esteban", "Zheng", new NIF("54577684", LocalDate.now())));
        pasajerosVuelo4.add(new Persona("Moussa", "Aliaga", new NIF("30398884", LocalDate.now())));
        pasajerosVuelo4.add(new Persona("Teresa", "Huerta", new NIF("67004662", LocalDate.now())));
        //Para el vuelo5
        pasajerosVuelo5.add(new Persona("Khalid", "Benavente", new NIF("27741789", LocalDate.now())));
        pasajerosVuelo5.add(new Persona("Andoni", "Ortiz", new NIF("26909431", LocalDate.now())));
        pasajerosVuelo5.add(new Persona("Gaizka", "Mari", new NIF("26909431", LocalDate.now())));

        //Creamos la lista de vuelos
        ArrayList<Avion> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Avion("00001", "España", "Grecia", 4, pasajerosVuelo1));
        listaVuelos.add(new Avion("00002", "España", "Alemania", 6, pasajerosVuelo2));
        listaVuelos.add(new Avion("00003", "España", "Portugal", 2, pasajerosVuelo3));
        listaVuelos.add(new Avion("00004", "Argentina", "España", 8, pasajerosVuelo4));
        listaVuelos.add(new Avion("00005", "Noruega", "España", 8, pasajerosVuelo5));

        System.out.println("El avión 00004 tiene los pasajeros " + numeroPasajeros("00004", listaVuelos));

        System.out.println("\n\n----SIN ORDENAR----");
        Map<String, Integer> listaPasajeros = devuelvePasajeros(listaVuelos);
        System.out.println(listaPasajeros.toString());

        System.out.println("\n\n-----ORDENADO------");
        Map<String, Integer> listaPasajerosOrdenado = devuelvePasajerosOrdenada(listaVuelos);
        System.out.println(listaPasajerosOrdenado.toString());

    }

    //Método el cual pasándole una lista de vuelos dice cuántos pasajeros van a cada destino
    private static Map<String, Integer> devuelvePasajeros(ArrayList<Avion> listaVuelos) {
        Map<String, Integer> listaPasajeros = new HashMap<>();

        //recorremos para que se añada al map
        for (int i = 0; i < listaVuelos.size(); i++) {

            //miramos si el map contiene la clave primaria
            if (listaPasajeros.containsKey(listaVuelos.get(i).getCiudadDestino())) {

                //En caso de que se repita, borramos y sustituimos valores
                listaPasajeros.put(listaVuelos.get(i).getCiudadDestino(),
                        listaPasajeros.get(listaVuelos.get(i).getCiudadDestino())
                        + listaVuelos.get(i).getListaPasajeros().size());

            } else {

                listaPasajeros.put(listaVuelos.get(i).getCiudadDestino(),
                        listaVuelos.get(i).getListaPasajeros().size());

            }

        }
        return listaPasajeros;
    }

    //Método el cual pasándole una lista de vuelos dice cuántos pasajeros van a cada destino
    //de forma ordenada
    private static Map<String, Integer> devuelvePasajerosOrdenada(ArrayList<Avion> listaVuelos) {
        Map<String, Integer> listaPasajeros = new TreeMap<>();

        //recorremos para que se añada al map
        for (int i = 0; i < listaVuelos.size(); i++) {

            //miramos si el map contiene la clave primaria
            if (listaPasajeros.containsKey(listaVuelos.get(i).getCiudadDestino())) {

                //En caso de que se repita, borramos y sustituimos valores
                listaPasajeros.put(listaVuelos.get(i).getCiudadDestino(),
                        listaPasajeros.get(listaVuelos.get(i).getCiudadDestino())
                        + listaVuelos.get(i).getListaPasajeros().size());

            } else {

                listaPasajeros.put(listaVuelos.get(i).getCiudadDestino(),
                        listaVuelos.get(i).getListaPasajeros().size());

            }

        }
        return listaPasajeros;
    }

    //Método el cual sirve para contarbilizar el número de pasajeros de un avión
    private static Map<String, ArrayList<Persona>> numeroPasajeros(String codigo, ArrayList<Avion> listaVuelos) {
        Map<String, ArrayList<Persona>> lista = new HashMap<>();
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i).getCodVuelo().equalsIgnoreCase(codigo)) {
                lista.put(codigo, listaVuelos.get(i).getListaPasajeros());
            }

        }
        return lista;
    }

}
