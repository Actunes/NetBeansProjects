/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoAssalariado extends Empregado {
    
    private double salarioSemanal;
    
    public EmpregadoAssalariado(double salarioSemanal, String nome, String sobrenome){
        super(nome, sobrenome);
        this.salarioSemanal = salarioSemanal;
    }
    
    public double getSalarioSemanal(){
        return this.salarioSemanal;
    }
    
    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal = (salarioSemanal < 0.0 ) ? 0.0 : salarioSemanal;
    }
    
    @Override 
    public double calculaSalario(){
        return salarioSemanal;
    }
    
    @Override
    public String toString(){
        return "==== Empregado Assalariado ====\n" + "Salario Semanal: " + this.salarioSemanal; 
    }
}
