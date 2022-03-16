/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author cristina
 */
public abstract class Figura {

    /*
    Sobrecargar significa definir nuevos métodos. Sobrescribir significa ocultar un método con una nueva definición de ese mismo método.
     */
    protected int base;
    protected int altura;
    protected String nombreFigura;

    public Figura(int base, int altura, String nombreFigura) {
        this.base = base;
        this.altura = altura;
        this.nombreFigura = nombreFigura;
    }

    public Figura() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }

    public abstract double calcularArea();

    public final String areaString() {
        double area = 0;
        return "Area del " + this.nombreFigura + " = " + (int) area + "cm²";
    }
}
