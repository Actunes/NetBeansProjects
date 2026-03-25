
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author igor
 *
 * Faça um algoritmo que receba três notas e seus respectivos pesos, calcule e
 * mostre a média ponderada dessas notas.
 *
 */
public class Ex01 {

    public static void main(String[] args) {

        double nota1, nota2, nota3;
        double peso1, peso2, peso3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite o peso da nota: ");
        peso1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite o peso da nota: ");
        peso2 = ler.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextDouble();
        System.out.println("Digite o peso da nota: ");
        peso3 = ler.nextDouble();

        double mediaPonderada = ((nota1 + peso1) + (nota2 + peso2) + (nota3 + peso3)) / (peso1 + peso2 + peso3);

        System.out.println("Media ponderada: " + (nota1 + nota2 + nota3) / 3);

    }

}
