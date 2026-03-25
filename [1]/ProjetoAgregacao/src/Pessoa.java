/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private Data dataDeNascimento;

    public Pessoa(String nome, String cpf, Data dataAniversario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataAniversario;
    }

    @Override

    public String toString() {
        return String.format("== Pessoa ==\n " + "Nome: " + this.nome + "\nCpf: " + this.cpf + "\nData de Nascimento: " + this.dataDeNascimento);
    }

}
