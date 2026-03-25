/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ClasseExercicio11 {
     public static void main(String[] args){
         
         Scanner ler = new Scanner(System.in);
         
         double salBase,salReceber;
         
         System.out.println("Digite o Salario Base: ");
         salBase = ler.nextDouble();
         
         salReceber =  (salBase * 0.05) + salBase - (salBase * 0.07) ;
         
         System.out.println("Salario a receber [5% de Gratificicacao - 7% de Imposto] : " + salReceber);
         
     }
}
