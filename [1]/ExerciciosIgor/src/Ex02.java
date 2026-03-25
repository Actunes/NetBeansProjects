
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * 
 *  Escreva um algoritmo que receba o salário de um funcionário, determine e escreva o novo
 *  salário, sabendo-se que este sofreu um aumento de 15%
 * 
 */
public class Ex02 {
 
    public static void main(String[] args){
        
        double salFuncionario;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salario do funcionario: ");
        
        salFuncionario = ler.nextDouble();
        
        System.out.println("Salario do funcionario com 15% de aumento: " + ((salFuncionario * 0.15) + salFuncionario));
    
    }
    
}
