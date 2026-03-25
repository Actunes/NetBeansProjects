/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class PessoaTeste {
    
    public static void main(String[] args){
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Antonio Thomas";
        pessoa1.peso = 67.3;
        pessoa1.idade = 32;
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Henry Pedro";
        pessoa2.peso = 77;
        pessoa2.idade = 22;
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Marcos Andre";
        pessoa3.peso = 54;
        pessoa3.idade = 55;
        
        pessoa1.imprimeObjeto();
        pessoa1.andar();
        pessoa1.andar();
        pessoa1.imprimeObjeto();
        
        pessoa2.imprimeObjeto();
        pessoa3.imprimeObjeto();
        
        pessoa1.toString();
        
    }
    
}
