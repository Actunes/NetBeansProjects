/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class ClasseExercicio03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vetor1[] = new int[20];

        System.out.println("Digite os 20 numeros");
        
        int pares = 0;
        int impares = 0;

        //int vetor1[] = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
        for (int i = 0; i < vetor1.length; i++) {

            vetor1[i] = ler.nextInt();

        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                System.out.println(vetor1[i] + " Valor Par");
                pares++;
                System.out.println(impares);
            }else {
                System.out.println(vetor1[i] + " Valor impar");
                impares++;
                System.out.println(impares);
                
            }
        }
    }
 }
        