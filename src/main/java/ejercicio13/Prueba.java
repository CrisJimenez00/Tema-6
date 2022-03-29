/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) {
        //Crea estudiantes
        Estudiante est1 = new Estudiante("2UM75QAL", "Gloria", "Zambrano Rodenas", "54876019C", new Direccion("Paseo Lorem", "Tel Aviv", "64951", "Israel"));
        Estudiante est2 = new Estudiante("ZFE6CMYE", "Ismael", "Sastre Benavides", "16835738Z", new Direccion("Miguel Rapid", "Sioux Falls", "26671", "EEUU"));

        //Crea trabajadores
        Profesor prof1 = new Profesor("Biología", "Beatriz", "Cabrera Quiñones", "73000630X", new Direccion("Kulas Squares", "Tlanchinol", "43162", "México"));
        Profesor prof2 = new Profesor("Matemáticas", "Victor", "Pelaez Sánchez", "59633339C", new Direccion("Martin Luther King Jr Ave", "Carolina del Norte", "27565", "EEUU"));

        //Los añado al array
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(est1);
        personas.add(est2);
        personas.add(prof1);
        personas.add(prof2);

        System.out.println("Lista completa");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());

        }

        System.out.println("");
        System.out.println("------------------El instanceof-------------------");
        for (Persona a : personas) {

            if (a instanceof Estudiante) {
                ((Estudiante) a).indetificate();
            } else if (a instanceof Profesor) {
                ((Profesor) a).indetificate();
            }

        }

    }

}
