/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopolindromo;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Palindromo {

    private boolean isPolidromo;
    private String palabra;
    private Scanner teclado;

    public Palindromo() {
        this.isPolidromo = isPolidromo;
        this.palabra = palabra;
        this.teclado = new Scanner(System.in);
    }

    public Palindromo(boolean isPolidromo, String palabra) {
        this.isPolidromo = isPolidromo;
        this.palabra = palabra;
        this.teclado = new Scanner(System.in);
    }

    public void pedirPalabra() {
//        try{
        System.out.println("Introduzca la palabra que desea que se sepa si es palindromo o no");
        palabra = teclado.next();
//        }catch();
    }

}
