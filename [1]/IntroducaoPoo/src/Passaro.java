/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Passaro {

    String corPenas;
    String formatoBico;
    String velocidadeVoo;
    double peso;

    public void voar() {

        System.out.println("O passaro está voando!");

    }

    public void piar(int vezesPiar) {

        if (vezesPiar <= 0) {
            System.out.println("Valor negativo ou nulo informado");
        } else {
            for (int i = 0; i <= vezesPiar; i++) {
                System.out.printf("Piou %d vez\n", i);
            }
        }

    }

    public String toString() {
        return "Passaro com cor: " + this.corPenas + "\nFormato do bico: " + this.formatoBico + "\nVelocidade de voo: " + this.velocidadeVoo + "\nPeso: " + this.peso;
    }

}
