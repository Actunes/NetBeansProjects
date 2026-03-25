package Ex04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Funcionario extends Pessoa{
    
    private int matricula;
    private double salario;
    
    public Funcionario(String nome, String sobrenome, int matricula, double salario){
        super(nome, sobrenome);
        this.matricula = matricula;
        setSalario(salario);
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setSalario(Double salario){
        if (salario < 0) {
            System.out.println("Salario Negativo!");
            this.salario = 0;
        }else{
            this.salario = salario;
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double getSalarioPrimeiraParcela(){
        return this.salario * 0.60;
    }
    
    public double getSalarioSegundaParcela(){
        return this.salario * 0.40;
    }
    
    
    
    
}
