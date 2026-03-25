
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 * 
 * Escreva um algoritmo que receba o salário de um funcionário e o percentual de aumento,
 * determine e escreva o valor do aumento e o novo salário
 * 
 * 
 */
public class Ex03 {
    
  public static void main(String[] args){
      
      Scanner ler = new Scanner(System.in);
      
      double salFuncionario;
      int porcentualAumento;
      
      System.out.println("Digite o salario do funcionario: ");
      salFuncionario = ler.nextDouble();
      
      System.out.println("Digite o percentual de auemnto: ");
      porcentualAumento = ler.nextInt();
       
      System.out.println("Salario do funcionario com " + porcentualAumento + "% de aumento: " + ((salFuncionario * porcentualAumento/100) + salFuncionario));
      
  }  
    
}
