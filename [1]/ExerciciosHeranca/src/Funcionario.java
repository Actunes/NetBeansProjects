/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public Funcionario(int matricula, double salario, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setSalario(double salario){
        this.salario = (salario > 0) ? salario : 0;
    }
    
    public double  getSalarioPrimeiraParcela(){
        return this.salario * 0.60;
    }
    
    public double getSalarioSegundaParcela(){
        return this.salario * 0.40;
    }

}