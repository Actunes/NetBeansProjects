/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author igor
 */
public class EmpregadoTeste {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Nome1", "Sobrenome1", 5000);
        Empregado empregado2 = new Empregado("Nome2", "Sobrenome2", 4500);

        System.out.println("===============================");
        System.out.println("======== Salario Anual ========");
        System.out.println("===============================");
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + "| Salario > " + (empregado1.getSalario() * 12));
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + "| Salario > " + (empregado2.getSalario() * 12));
        System.out.println("===============================");
        System.out.println("===== Salario Anual + 10% =====");
        System.out.println("===============================");
        empregado1.setSalario(empregado1.getSalario() * 1.10);
        empregado2.setSalario(empregado2.getSalario() * 1.10);
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + "| Salario > " + (empregado1.getSalario() * 12));
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + "| Salario > " + (empregado2.getSalario() * 12));
        
    }

}
