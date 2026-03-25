/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Banco {

    private String nomeTitular = "";
    private int numeroConta;
    private double saldoConta = 0;

    public Banco(String nomeTitular, int numeroConta, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public Banco(String nomeTItular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public void depositarSaldo(double valor){
        this.saldoConta += valor;
    }
    
    public void sacarSaldo(double valor){
        this.saldoConta -= valor + 5;
    }

    @Override
    public String toString() {
        return "== Dados da conta == \n Nome Titular: " + this.nomeTitular + "\nNumero da conta: " + this.numeroConta + "\n" + "Saldo da conta: " + this.saldoConta + "\n";
    }
    
}
