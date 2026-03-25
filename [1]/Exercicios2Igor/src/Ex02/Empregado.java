/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author igor
 */
public class Empregado {
    
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}
