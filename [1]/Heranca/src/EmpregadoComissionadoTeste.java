/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoComissionadoTeste {
    
    public static void main(String[] args){
        
        EmpregadoComissionado empregado1 = new EmpregadoComissionado("Joao", "Silva", 10000, 0.05);
        System.out.println("=== Dados do empregado ===\n");
        System.out.println("Nome: " + empregado1.getNome() + ' ' + empregado1.getSobrenome());
        System.out.println("Vendas Brutas: " + empregado1.getComissao());
        System.out.println("Comissao: " + empregado1.getComissao());
        System.out.println("Salario: " + empregado1.calcularSalario());
        
        System.out.println("==============");
        System.out.println("=== Dados === - Metodo toString\n");
        System.out.println(empregado1.toString());
        
        System.out.println("==============");
        
        EmpregadoComissionadoFixo empregado2 = new EmpregadoComissionadoFixo(3000, "Maicon", "Douglas", 5000, 0.05);
        
        System.out.println(empregado2.toString());
        
    }
    
}
