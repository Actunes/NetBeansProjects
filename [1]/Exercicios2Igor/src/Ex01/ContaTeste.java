/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author igor
 */
public class ContaTeste {
    
    public static void main(String[] args){
        
        Conta conta1 = new Conta(0, "Nome pessoa", 0.0);
        Conta conta2 = new Conta(1, "Nome2 pessoa2", 150.0);
        
        conta1.imprimeRecibo();
        conta2.imprimeRecibo();
        System.out.println("\n\n\n");
        System.out.println("========== Depositos ==========\n");
        conta1.depositar(50);
        conta2.depositar(50);
        conta1.imprimeRecibo();
        conta2.imprimeRecibo();
        System.out.println("\n\n\n");
        System.out.println("============ Saques ===========\n");
        conta1.sacar(100);
        conta2.sacar(100);
        conta1.imprimeRecibo();
        conta2.imprimeRecibo();
        
    }
    
}
