/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class ControleDeBonificacoes {
    
    private double totalDeBonificacoes = 0;
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
    
    public void setTotalDeBonificacoes(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    
}
