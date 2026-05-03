/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Aluno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Aluno
 */
public class AlunoDao {

    private Connection con = null;

    public AlunoDao() {
        con = ConnectionFactory.getConnection();
    }

    public boolean create(Aluno aluno) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO aluno (nome, endereco, fone, email, matricula, curso) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getFone());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCurso());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean update(Aluno aluno) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE aluno set nome = ? , endereco = ? , fone = ? , email = ? , matricula = ? , curso = ? WHERE idaluno = ?");
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getFone());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCurso());
            stmt.setInt(7, aluno.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Aluno aluno) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM aluno WHERE idaluno = ?");
            stmt.setInt(1, aluno.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);

        }
    }

    public ArrayList<Aluno> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM aluno ORDER by idaluno");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                listaAlunos.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao leitura: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return listaAlunos;
    }

}
