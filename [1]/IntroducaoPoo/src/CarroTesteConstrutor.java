/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class CarroTesteConstrutor {
    
    public static void main(String[] args){
        CarroConstrutor carro1 = new CarroConstrutor("Super luxo", 5);
        System.out.println("Modelo do carro: " + carro1.getModelo());
        System.out.println("Quantidade de passageiros: " + carro1.getQuantidadeDePassageiros());
        
        CarroConstrutor carro2 = new CarroConstrutor("Super luxo");
        CarroConstrutor carro3 = new CarroConstrutor();
        CarroConstrutor carro4 = new CarroConstrutor(4);
        
    }
    
}
