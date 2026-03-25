/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * 
 *  Faça um algoritmo que carregue um vetor com dez números reais, calcule e mostre a
quantidade de números negativos e a soma dos números positivos desse vetor.
 * 
 */
public class Ex09 {
    
    public static void main(String[] args){
        
        int vetor[] = {1,2,3,4,5,-2,-3,-4,-5,6};
        int quantidadeNegativos = 0;
        int somaPositivos = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                quantidadeNegativos++;
            }else{
                somaPositivos += vetor[i];
            }
        }
        
        System.out.println("Quatidade de numeros negativos encontrados; " + quantidadeNegativos);
        System.out.println("Soma de todos os positivos: " + somaPositivos);
        
    }
    
}
