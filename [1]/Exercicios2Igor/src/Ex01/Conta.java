package Ex01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author igor
 */
public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {

        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > this.saldo) {
            System.out.println("Valor insuficiente para saque!");
        } else {
            this.saldo -= valorSaque;
        }
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void imprimeRecibo() {
        System.out.println("======= RECIBO BANCARIO =======");
        System.out.printf("Numero da Conta: %d%n", this.numero);
        System.out.printf("Titular:         %s%n", this.titular);
        System.out.printf("Saldo Atual:     R$ %.2f%n", this.saldo);
        System.out.println("===============================");
    }

}
