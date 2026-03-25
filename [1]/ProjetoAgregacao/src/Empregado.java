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
    private Data dataDeNascimento;
    private Data dataDeContratacao;

    public Empregado(String nome, String sobrenome, Data aniversario, Data contratacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = aniversario;
        this.dataDeContratacao = contratacao;
    }

    @Override

    public String toString() {
        return String.format("%s, %s Contratado em: %s Aniversario em: %s", sobrenome, nome, dataDeContratacao, dataDeNascimento);
    }

}
