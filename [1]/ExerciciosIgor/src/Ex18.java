/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 *  Fazer um programa que receba dois vetores com a mesma quantidade de elementos
 * inteiros e gere um vetor intercalando os elementos dos vetores dados.
 */
public class Ex18 {
    
    public static void main(String[] args) {
        
        int vetorA[] = {4, 8, 1, 9};
        int vetorB[] = {2, 5, 7, 3};
        
        int vetorC[] = new int[vetorA.length + vetorB.length];
        
        int indexC = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[indexC] = vetorA[i];
            indexC++;
            
            vetorC[indexC] = vetorB[i];
            indexC++;
        }
        
        System.out.println("Vetor A:");
        printArray(vetorA);
        
        System.out.println("\nVetor B:");
        printArray(vetorB);
        
        System.out.println("\nVetor C");
        printArray(vetorC);
    }
    
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}