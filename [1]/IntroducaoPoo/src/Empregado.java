/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Empregado {

    private String nome;
    private String sobrenome;
    private double salMensal;
    private double salAnual;

    public Empregado(String nome, String sobrenome, double salMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salMensal = salMensal;
        this.salAnual = (salMensal + (salMensal * 0.10)) * 12;
    }

    @Override
    public String toString() {
        return "== Dados do funcionario == \nNome: " + this.nome + "\nSobrenome: " + this.sobrenome + "\n" + "Salario mensal: " + this.salMensal + "\n" + "Salario anual: " + this.salAnual + "\n";
    }

}
