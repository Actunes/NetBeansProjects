/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ProdutoDao {
    
    private Connection con = null;
    
    public ProdutoDao() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create(Produto produto) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao, qtd, preco) VALUES (?,?,?)");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getPreco());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
