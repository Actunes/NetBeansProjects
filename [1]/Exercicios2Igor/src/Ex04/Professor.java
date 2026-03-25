/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author igor
 */
public class Professor extends Funcionario{
    
    public Professor(String nome, String sobrenome, int matricula, double salario){
        super(nome, sobrenome, matricula, salario);
    }
    
    @Override
    public double getSalarioPrimeiraParcela(){
        return getSalario();
    }
    
    @Override
    public double getSalarioSegundaParcela(){
        return 0;
    }
    
}
