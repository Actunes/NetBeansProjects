/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNOme(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
    
    @Override
    public String toString(){
        return "Funcionario: " + this.nome + "\nCpf: " + this.cpf + "Salario: " + this.salario + "Bonificacao: " + getBonificacao();
    }
    
}
