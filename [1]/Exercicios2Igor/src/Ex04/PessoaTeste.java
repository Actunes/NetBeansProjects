/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author igor
 */
public class PessoaTeste {
    
    public static void main(String[] args){
        
        Pessoa pessoa1 = new Pessoa("Nome1", "Sobrenome1");
        Funcionario funcionario1 = new Funcionario("NomeFunc1", "SobrenomeFunc1", 1, 2000);
        Professor professor1 = new Professor("NomeProf1", "NomeProf2", 2, 3000);
        
        System.out.println("===============================");
        System.out.println("========= Funcionario =========");
        System.out.println("===============================");
        System.out.println("Nome Completo > " + funcionario1.getNomeCompleto());
        System.out.println("Salario 1 parcela > " + funcionario1.getSalarioPrimeiraParcela());
        System.out.println("Salario 2 parcela > " + funcionario1.getSalarioSegundaParcela());
        System.out.println("Classe > " + funcionario1.getClass());
        System.out.println("===============================");
        
        System.out.println("===============================");
        System.out.println("========== Professor ==========");
        System.out.println("===============================");
        System.out.println("Nome Completo > " + professor1.getNomeCompleto());
        System.out.println("Salario 1 parcela > " + professor1.getSalarioPrimeiraParcela());
        System.out.println("Salario 2 parcela > " + professor1.getSalarioSegundaParcela());
        System.out.println("Classe > " + professor1.getClass());
        System.out.println("===============================");
        
    }
    
}
