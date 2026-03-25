/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex06;

/**
 *
 * @author igor
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000.00);

        SeguroDeVida seguro = new SeguroDeVida();

        System.out.println("========= TRIBUTOS =========");
        System.out.println("Tributo Conta Corrente > R$ " + cc.calculaTributos());
        System.out.println("Tributo Seguro de Vida > R$ " + seguro.calculaTributos());
        Tributavel t = cc;
        System.out.println("Tributo calculado > R$ " + t.calculaTributos());
    }
}
