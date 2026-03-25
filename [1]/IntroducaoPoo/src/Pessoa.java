/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Pessoa {

    String nome;
    double peso;
    int idade;

    public void andar() {
        this.peso -= 1;
        System.out.println("Pessoa: " + this.nome + " -1 | peso removido: " + this.peso);
        
    }

    public void falar() {

    }

    public void come() {
        this.peso += 1;
        System.out.println("Pessoa: " + this.nome + " -1 | peso adicionado: " + this.peso);
    }

    public void fazAniversario() {
        this.idade += 1;
        System.out.println("Pessoa: " + this.nome + " -1 | Idade adicionado: " + this.peso);
    }
    
    public void imprimeObjeto() {
        System.out.println("Nome: " + this.nome + "\nPeso: " + this.peso + "\nIdade: " + this.idade);
    }
    
    public String toString(){
        return "Nome: " + this.nome + "\nPeso: " + this.peso + "\nIdade: " + this.idade;
    }

}
