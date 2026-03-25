/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

/**
 *
 * @author igor
 */
public class Produto {
    
    private String descricao;
    private int quantidade;
    private double preco;
    private Categoria categoria;
    
    public Produto(){}
    
    public Produto(String descricao, int quantidade, double preco, Categoria categoria){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public Categoria getCategoria(){
        return this.categoria;
    }
    
    @Override
    public String toString(){
        return "Produto: " + this.descricao + 
               " | Quantidade: " + this.quantidade + 
               " | Preco: R$ " + this.preco + 
               " | " + this.categoria.toString();
    }
    
}
