/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

public class Carro {
    
    String cor;
    int numeroPortas;
    double capacidadeTanque;
    double velocidadeAtual;
    double quilometrosPercorridos;
    
    public void acelerar(int valorAcelerar){
        System.out.printf("Valor esta aumentando para: %d km/h \n", valorAcelerar);
    }
    
    public void ligar(){
    
        System.out.println("Ligando o carro");
        
    }
    
    public void desligar(){
        System.out.println("Desligando o carro");
    }
    
}