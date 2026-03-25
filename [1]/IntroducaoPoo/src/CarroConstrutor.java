/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class CarroConstrutor {

    private String modelo = "Luxo";
    private int quantidadeDePassageiros = 4;
    
    public CarroConstrutor(String mod, int qnt){
        this.modelo = mod;
        this.quantidadeDePassageiros = qnt;
    }
    
    public CarroConstrutor(){
        System.out.println("Carro Criado!");
    }
    
    public CarroConstrutor(String mod){
        this.modelo = mod;
    }
    
    public CarroConstrutor(int qnt){
        this.quantidadeDePassageiros = qnt;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getQuantidadeDePassageiros() {
        return this.quantidadeDePassageiros;
    }

    public void setModelo(String mod) {
        this.modelo = mod;
    }

    public void setQuantidadeDePassageiros(int qnt) {
        this.quantidadeDePassageiros = qnt;
    }

    public void acelerar(int velDesejada) {
        System.out.println("Velociade aumentando ate: " + velDesejada);
    }

    @Override
    public String toString() {
        return "Modelo do carro: " + this.getModelo() + "\nQuantidade de Passageiros: " + this.quantidadeDePassageiros;
    }

}
