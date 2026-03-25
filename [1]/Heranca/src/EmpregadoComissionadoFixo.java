/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoComissionadoFixo extends EmpregadoComissionado{
    
    private double salarioFixo;
    
    public EmpregadoComissionadoFixo(double salarioFixo, String nome, String sobrenome, double vendasBrutas, double comissao){
        super(nome, sobrenome, vendasBrutas, comissao);
        this.salarioFixo = salarioFixo;
    }
    
    public double getSalarioFixo(){
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFIxo){
        this.salarioFixo = (salarioFixo > 0.0) ? salarioFixo : 0;
    }
    
    @Override
    public double calcularSalario(){
        return salarioFixo + super.calcularSalario();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nEmpregado comissionado fixo( salario Fixo:" + salarioFixo + ")"; 
    }
    
}
