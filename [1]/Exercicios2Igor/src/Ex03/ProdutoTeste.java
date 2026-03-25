/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

/**
 *
 * @author igor
 */
public class ProdutoTeste {
    
    public static void main(String[] args){
        
        Categoria catEletronicos = new Categoria("Eletronicos");
        Categoria catFerramentas = new Categoria("Ferramentas");
        Categoria catDecoracao = new Categoria("Decoracao");
        
        Produto produto1 = new Produto("Notebook", 5 , 4500, catEletronicos);
        Produto produto2 = new Produto("Furadeira", 6, 2000, catFerramentas);
        Produto produto3 = new Produto("Quadro", 11, 310, catDecoracao);
        
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        
    }
    
}
