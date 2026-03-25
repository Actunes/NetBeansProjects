/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public abstract class Empregado {
    
    private String nome;
    private String sobrenome;
    
    public Empregado(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public abstract double calculaSalario();
    
    @Override
    public String toString(){
        return "==== Empregado Comissionado ==== \n" + "Nome:" + this.nome + " " + this.sobrenome;
    }
    
}
