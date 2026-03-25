/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Curso {
    
    private String nome;
    private int duracaoMeses;
    
    public Curso(String nome, int duracaoMeses){
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getDuracaoMeses(){
        return this.duracaoMeses;
    }
}


