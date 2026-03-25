package Ex04;

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
    private String sobrenome;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
    
    @Override
    public String toString(){
        return this.nome + " " + this.sobrenome;
    }
    
    
}
