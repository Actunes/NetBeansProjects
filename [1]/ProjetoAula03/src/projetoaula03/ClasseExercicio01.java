/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClasseExercicio01 {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        int vetor1[] = new int[20];

        int maiorElemento = 0;
        int posicaoElemento = 0;

        for (int i = 0; i < vetor1.length; i++) {

            System.out.println("Informa valor para a posicao" + i + ":");

            vetor1[i] = ler.nextInt();

            if (vetor1[i] > maiorElemento) {
                maiorElemento = vetor1[i];
                posicaoElemento = i;
            }

        }

        System.out.println("Maior Elemento encontrado > " + maiorElemento);
        System.out.println("Posicao do maior Elemento > " + posicaoElemento);
        
    }

}
