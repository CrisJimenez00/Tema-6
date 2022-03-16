/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author cristina
 */
public class Romboide extends Figura {
    
    public Romboide(int base, int altura) {
        super(base, altura, "Romboide");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
