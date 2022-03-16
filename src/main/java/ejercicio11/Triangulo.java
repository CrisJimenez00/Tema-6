/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author cristina
 */
public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura, "Triangulo");
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
