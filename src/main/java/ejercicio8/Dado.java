/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class Dado extends Azar {

    private Random random;

    public Dado() {
        random = new Random();
    }

    @Override
    public int lanzar() {
        int numero = random.nextInt(6) + 1;
        return numero;
    }

}
