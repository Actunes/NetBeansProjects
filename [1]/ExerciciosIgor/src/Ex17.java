import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * * Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
 * • O número de caracteres da string.
 * • A string com todas suas letras em maiúsculo.
 * • Se a string digitada começa com “INS” (ignorando maiúsculas/minúsculas).
 * • Se a string digitada termina com “AIS” (ignorando maiúsculas/minúsculas).
 *
 */
public class Ex17 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma string:");
        String texto = ler.nextLine();

        System.out.println("Numero de caracteres da string: " + texto.length());

        System.out.println("String em MAISCULAS: " + texto.toUpperCase());
        
        boolean comecaComINS = texto.toLowerCase().startsWith("ins");
        System.out.println("Comeca com INS: " + comecaComINS);
        
        boolean terminaComAIS = texto.toLowerCase().endsWith("ais");
        System.out.println("Termina com AIS? " + terminaComAIS);
    }
}