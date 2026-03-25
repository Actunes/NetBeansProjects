import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * * Faça um programa que leia uma matriz [5x5]. Após leia um valor qualquer e conte
 * * quantas vezes este valor aparece na matriz.
 */
public class Ex19 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int matriz[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Valor para a posicao [%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nDigite o valor para buscar na matriz:");
        int valorProcurado = ler.nextInt();
        
        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorProcurado) {
                    contador++;
                }
            }
        }
        
        System.out.println("Numero de vezes que aparece: " + contador);
        
    }
}