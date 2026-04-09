/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

    
    import java.util.ArrayList;
    import model.bean.Produto;
    import model.dao.ProdutoDao;

/**
 *
 * @author Aluno
 */
public class ProdutoController {

    public boolean create(String descricao, int quantidade, double preco){
        Produto produto = new Produto();
        ProdutoDao produtoDao = new ProdutoDao();
        
        produto.setDescricao(descricao);
        produto.setQtd(quantidade);
        produto.setPreco(preco);
        
        return produtoDao.create(produto);
    }
    
}
