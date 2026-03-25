/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Gerente extends Funcionario{
    
    private String senha;
    private int nroFuncionariosGerenciados;
    
    public int getNroFuncionariosGerenciados(){
        return nroFuncionariosGerenciados;
    }
    
    public void setNroFuncionariosGerenciados(int nroFuncionariosGerenciados){
        this.nroFuncionariosGerenciados = nroFuncionariosGerenciados;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.15;
    }
    
    public boolean autentica (String senha){
        if(this.senha.equals(senha)) {
            System.out.println("Acesso permitido");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "=== Gerente === \n" + super.toString() + "Numero funcionarios Gerenciados: " + nroFuncionariosGerenciados;
    }
    
}
