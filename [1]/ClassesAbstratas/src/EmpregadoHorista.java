/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoHorista extends Empregado {
    
    private double valorHora;
    private double horas;
    
    public EmpregadoHorista(double valorHora, double horas, String nome, String sobrenome){
        super(nome, sobrenome);
        this.valorHora = valorHora;
        this.horas = horas;
    }
    
    public double getHoras(){
        return this.horas;
    }
   
    public void setHoras(double horas){
        this.horas = ((horas >= 0.0) && (horas <= 168.0)) ? horas : 0.0;
    }
    
    public double getValorHora(){
    return valorHora;
    }
    
    public void setValorHora(double valorHora){
        this.valorHora = (valorHora < 0.0) ? 0.0 : valorHora;
    }
    
    @Override
    public double calculaSalario(){
        if(horas <= 40){
            return valorHora * horas;
        }
        else {
            return 40 * valorHora + (horas -40) * valorHora * 1.5;
        }
            
    }
    
    @Override
    public String toString(){
        return "==== Empregado Horista ====\n" + "Valor Hora: " + this.horas + "\nHoras:" + this.valorHora;
    }
    
    
    
}
