/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author igor
 * Crie um algoritmo que leia o valor de um depósito (aplicação) e o valor da taxa do fundo
 * de rendimento, calcule e mostre o valor do rendimento e o valor total da aplicação depois
 * do rendimento.
 *
 */
public class Ex05 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        double valorDeposito;
        double taxaRendimento;
        double valorRendimento;
        double valorTotal;
        
        System.out.println("Digite o valor do deposito: ");
        valorDeposito = ler.nextDouble();
        
        System.out.println("Digite a taxa de rendimento: ");
        taxaRendimento = ler.nextDouble();
        
        double taxaDecimal = taxaRendimento / 100.0;
        
        valorRendimento = valorDeposito * taxaDecimal;
        
        valorTotal = valorDeposito + valorRendimento;
        
        System.out.println("Valor do deposito:" +  valorDeposito);
        System.out.println("Taxa de rendimento:" +  taxaRendimento);
        System.out.println("Valor do rendimento: " + valorRendimento);
        System.out.println("Valor total após o rendimento" + valorTotal);
        
    }
    
}