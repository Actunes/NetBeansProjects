/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoComissionado {

    private String nome;
    private String sobrenome;
    private double vendasBrutas;
    private double comissao;

    public EmpregadoComissionado(String nome, String sobrenome, double vendasBrutas, double comissao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.vendasBrutas = vendasBrutas;
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public double getVendasBrutas() {
        return this.vendasBrutas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = (vendasBrutas > 0) ? vendasBrutas : 0;
    }

    public void setComissao(double comissao) {
        this.comissao = (comissao > 0.0 && comissao < 1.0) ? comissao : 0;
    }

    public double calcularSalario() {
        return vendasBrutas * comissao;
    }

    @Override
    public String toString() {
        return "Empregado Comissionado: " + nome + ' ' + sobrenome + "\nVendas brutas: " + vendasBrutas + "\nComissao: " + comissao + "\nSalario: " + calcularSalario();
    }

}
