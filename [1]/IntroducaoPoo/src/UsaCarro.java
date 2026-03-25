/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

import java.util.Scanner;

public class UsaCarro {
    
    public static void main(String[] args){
        CarroGetSet carro1 = new CarroGetSet();
        
        carro1.setModelo("Popular");
        carro1.setQuantidadeDePassageiros(2);
        
        System.out.println("Modelo do carro: " + carro1.getModelo());
        System.out.println("Quanitdade de passageiros: " + carro1.getQuantidadeDePassageiros());
        
        Scanner ler = new Scanner(System.in);
    
        int velocidade = ler.nextInt();
        
        carro1.acelerar(velocidade);
    }
    
}
