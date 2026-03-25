/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClasseExercicio8 {
    
    public static void main(String[] Args){
        
        int a,b,c,x;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();
        
        System.out.println("Digite o valor de C: ");
        c = ler.nextInt();
        
        x = (a * b) / c;
        
        System.out.println("Resultado: " + x);
        
    }
    
}
