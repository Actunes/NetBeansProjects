import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * * Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de
 * caracteres total e o número de palavras (palavra é definida por qualquer sequência de
 * caracteres delimitada por espaços em branco) e exiba o resultado.
 *
 *
 */
public class Ex14 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o texto:");
        String texto = ler.nextLine();
        
        int numCaracteres = texto.length();
        
        String[] palavras = texto.split("\\s+");
        int numPalavras = palavras.length;
        
        System.out.println("numero total caracteres: " + numCaracteres);
        System.out.println("numero total palavras: " + numPalavras);
        
    }
    
}