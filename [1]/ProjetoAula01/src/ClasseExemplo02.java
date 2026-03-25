
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ClasseExemplo02 {
    
    public static void main(String[] Args){
        int a,b,c;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um Numero: ");
        a = ler.nextInt();

        System.out.println("Informe outro Numero: ");
        b = ler.nextInt();

        c = a + b;
    
        System.out.println("Resultado: " + c);
    
    }
    
}
