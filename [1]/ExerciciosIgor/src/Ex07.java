
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * 
 * Usando uma estrutura de repetição, escreva um algoritmo que leia uma quantidade n
 * qualquer de valores e encontre a média dos valores, o maior e o menor deles. Mostre os
 * três resultados na tela.
 */
public class Ex07 {
    
    public static void main(String[] args){
        
        int numeroValores;
        int maiorValor = 0;
        int menorValor = 999999999;
        int somaValores = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite quantos valores serao inseridos: ");
        numeroValores = ler.nextInt();
        
        int vetorValores[] = new int[numeroValores];
        
        for(int i = 0; i < vetorValores.length; i++){
            
            System.out.println("Digite o " + (i+1) + " Valor");
            vetorValores[i] = ler.nextInt();
            somaValores += vetorValores[i];
            
            if(vetorValores[i] > maiorValor){
                maiorValor = vetorValores[i];
            }
            if(vetorValores[i] < menorValor ){
                menorValor = vetorValores[i];
            }
            
        }
        
        System.out.println("Maior Valor encontrado: " + maiorValor);
        System.out.println("Menor Valor encontrado: " + menorValor);
        System.out.println("Media de todos os valores: " + (somaValores / numeroValores));
        
    }
    
}
