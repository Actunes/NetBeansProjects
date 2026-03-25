/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoComissionado extends Empregado{
    
    private double vendasBrutas;
    private double comissao;
    
    public EmpregadoComissionado(double vendasBrutas, double comissao, String nome, String sobrenome){
        super(nome, sobrenome);
        this.vendasBrutas = vendasBrutas;
        this.comissao = comissao;
    }
    
    public double getComissao() {
        return comissao;
    }
    
    public void setComissao(){
        this.comissao = (comissao > 0.0 && comissao < 1.0) ? comissao : 0.0;
    }
    
    public void setVendasBrutas(double vendasBrutas){
        this.vendasBrutas = (vendasBrutas < 0.0) ? 0.0 : vendasBrutas;
    }
    
    @Override
    public double calculaSalario(){
        return comissao * vendasBrutas;
    }
    
    @Override
    public String toString(){
        return "==== Empregado Comissionado ====\n" + super.toString() + "\nVendas Brutas:" + this.vendasBrutas + "\nComissao:" + this.comissao;
    }
    
}
