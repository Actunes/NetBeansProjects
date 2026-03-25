/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

import java.util.Scanner;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        
        c1.cor = "Preto";
        c1.numeroPortas = 2;
        c1.quilometrosPercorridos = 120330;
        c1.capacidadeTanque = 48;
        
        System.out.println("Informe velocidade de acelero:");
        Scanner ler = new Scanner(System.in);
        
        int velocidade = ler.nextInt();
        
        
        c1.ligar();
        c1.acelerar(velocidade);
        System.out.println("Informe valor para freiar");
        velocidade = ler.nextInt();
        c1.acelerar(velocidade);
        c1.desligar();
    }

}
