
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * 
 * Usando um comando de repetição, criar um algoritmo que permita entrar com cinco
 * números e imprima o quadrado de cada número lido, caso o número lido seja ímpar e a
 * raiz quadrada, caso o número seja par.
 * 
 */
public class ex06 {
   
    public static void main(String[] args){
        
        int vetorNumeros[] = new int[5];
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite 5 valores: ");
        
        for(int i = 0 ; i < vetorNumeros.length; i++ ){
            vetorNumeros[i] = ler.nextInt();
            
            if (vetorNumeros[i] % 2 == 0) {
                double raizQuadrada = Math.sqrt(vetorNumeros[i]);
                System.out.println("O numero " + vetorNumeros[i] + " e par. Raiz Quadrada: " + raizQuadrada);
            } else {
                int quadrado = vetorNumeros[i] * vetorNumeros[i];
                System.out.println("O numero " + vetorNumeros[i] + " e impar. Quadrado: " + quadrado);
            }
      
        }
        
    }
    
}
