/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ClasseExercicio10 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Digite o valor de A");
        a = ler.nextInt();
        
        System.out.println("Digite o valor de B");
        b = ler.nextInt();
                       
        c = a;
        a = b;
        b = c;
        
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        
    }
    
}
