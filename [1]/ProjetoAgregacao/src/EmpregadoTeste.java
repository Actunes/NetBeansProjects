/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoTeste {
    
    public static void main(String[] args){
        Data aniversario = new Data(16, 6, 1973);
        Data contratacao = new Data(26, 12, 1990);
        Empregado empregado = new Empregado("Roberto", "Silva", aniversario, contratacao);
        
        System.out.println(empregado);
        
    }
    
}
