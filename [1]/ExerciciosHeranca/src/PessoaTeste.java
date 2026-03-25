/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class PessoaTeste {

    public static void main(String[] args) {

        System.out.println("== Classe pessoa ==");
        Pessoa pessoa1 = new Pessoa("Joao", "Silva");
        System.out.println(pessoa1.toString());
        System.out.println(pessoa1.getClass()); 

        System.out.println("=========");
        System.out.println("== Classe Funcionario ==");
        Funcionario funcionario1 = new Funcionario(1, 5000, "Mario", "Jose");
        System.out.println(funcionario1.getNomeCompleto());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Primeira parcela: " + funcionario1.getSalarioPrimeiraParcela());
        System.out.println("Primeira parcela: " + funcionario1.getSalarioSegundaParcela());
        System.out.println(funcionario1.getClass());
        System.out.println("=========");
        System.out.println("== Classe Professor ==");
        Professor professor1 = new Professor(1, 5000, "Andre", "Alves");
        System.out.println(professor1.getNomeCompleto());
        System.out.println("Salario: " + professor1.getSalario());
        System.out.println("Salario 1 parcela: " + professor1.getSalarioPrimeiraParcela());
        System.out.println("Salario 2 parcela: " + professor1.getSalarioSegundaParcela());
        System.out.println(professor1.getClass());

    }

}
