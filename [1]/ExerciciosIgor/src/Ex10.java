import java.util.Arrays;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * * Escrever um algoritmo que lê um vetor de 15 posições e o escreve na tela. Ordene a
 * seguir os elementos de A em ordem decrescente e escreva novamente A. O vetor A
 * abaixo deve ser usado para entender os exercícios seguintes, para a geração do vetor B:
 * A = [32,45,89,66,12,35,10,96,38,15,13,11,65,81,35,64,16,89,54,19]
 */
public class Ex10 {
    
    public static void main(String[] args){
        
        Integer vetorA[] = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        
        Arrays.sort(vetorA, Collections.reverseOrder());
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}