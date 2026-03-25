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
    
    public EmpregadoComissionadoFixo(double salarioFixo, double vendasBrutas, double comissao, String nome, String sobrenome){
        super(vendasBrutas, comissao, nome, sobrenome);
        this.salarioFixo = salarioFixo;
    }
    
    public double getSalarioFixo(){
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo){
        this.salarioFixo = (salarioFixo < 0.0) ? 0.0 : salarioFixo;
    }

    @Override
    public double calculaSalario(){
        return salarioFixo + super.calculaSalario();
    }
            
    public String toString(){
        return super.toString() + "Empregado Comissionado fixo | salario: " + this.salarioFixo;
    }
    
}
