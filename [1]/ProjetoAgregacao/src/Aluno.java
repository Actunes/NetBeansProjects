/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private Curso curso;
    
    public Aluno(String nome, String cpf, Curso curso){
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void mostrarDados(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Curso: " + curso.getNome() + "\n");
    }
        
}
