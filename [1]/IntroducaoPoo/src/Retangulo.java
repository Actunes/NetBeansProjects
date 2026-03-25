/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Retangulo {

    private int base = 1;
    private int altura = 1;

    public Retangulo(int b, int a) {
        this.base = b;
        this.altura = a;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setBase(int a) {

        if (a > 0 && a < 20) {
            this.altura = a;
        } else {
            System.out.println("Digite um valor entre 1 e 19");
        }

    }

    public void setAltura(int b) {
        if (b > 0 && b < 20) {
            this.base = b;
        } else {
            System.out.println("Digite um valor entre 1 e 19");
        }
    }
    
    public void calcularArea(){
        System.out.println("Calculo de Area: " + (this.base * this.altura));
    }
    
    public void calcularPerimetro(){
        System.out.println("Calculo de Perimetro: " + (2 * (this.base + this.altura)));
    }

    @Override
    public String toString() {
        return "== Dados do Retangulo == \nBase: " + this.base + "\nAltura: " + this.altura + "\n";
    }

}
