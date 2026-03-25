/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex05;

/**
 *
 * @author igor
 */
public class AreaTeste {
    public static void main(String[] args) {
        
        AreaCalculavel[] vetor = new AreaCalculavel[5];

        vetor[0] = new Quadrado(4);
        vetor[1] = new Retangulo(5, 2);
        vetor[2] = new Circulo(3);
        vetor[3] = new Quadrado(10);
        vetor[4] = new Retangulo(10, 10);

        System.out.println("========= Area OBJETOS =========");

        for (int i = 0; i < vetor.length; i++) {
            double area = vetor[i].calculaArea();
            
            System.out.println("Objeto " + (i + 1) + " " + area);
        }
    }
}