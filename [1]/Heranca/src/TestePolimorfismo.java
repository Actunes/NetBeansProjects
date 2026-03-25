/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class TestePolimorfismo {
    
    public static void main (String[] args){
        ControleDeBonificacoes controleBonificacoes = new ControleDeBonificacoes();
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNOme("Maria dos santos");
        funcionario.setCpf("000.000.000-00");
        funcionario.setSalario(2000);
        controleBonificacoes.setTotalDeBonificacoes(funcionario);
        System.out.println(funcionario);
        
        Gerente gerente = new Gerente();
        gerente.setSenha("1234");
        gerente.setNroFuncionariosGerenciados(5);
        gerente.setNOme("Joao da silva");
        gerente.setCpf("123.456.789-00");
        gerente.setSalario(5000);
        controleBonificacoes.setTotalDeBonificacoes(gerente);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente();
        Funcionario funcionario2 = gerente2;
        funcionario2.setSalario(5000);
        System.out.println(funcionario2);
        
        controleBonificacoes.setTotalDeBonificacoes(funcionario2);
        System.out.println("Total de bonificacoes: " + controleBonificacoes.getTotalDeBonificacoes());
        
    }
    
}
