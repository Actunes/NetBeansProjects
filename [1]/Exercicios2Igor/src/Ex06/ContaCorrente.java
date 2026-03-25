/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex06;

/**
 *
 * @author igor
 */
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return this.obterSaldo() * 0.01;
    }
}
