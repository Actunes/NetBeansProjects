/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Medico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class MedicoDao {

    private Connection con = null;

    public MedicoDao() {
        con = ConnectionFactory.getConnection();
    }

    public boolean create(Medico medico) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO medico (nome, cpf, endereco, telefone, crm, especialidade) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCpf());
            stmt.setString(3, medico.getEndereco());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getCrm());
            stmt.setString(6, medico.getEspecialidade());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean update(Medico medico) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE medico set nome = ? , cpf = ? , endereco = ? , telefone = ? , crm = ? , especialidade = ? WHERE id_medico = ?");
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCpf());
            stmt.setString(3, medico.getEndereco());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getCrm());
            stmt.setString(6, medico.getEspecialidade());
            stmt.setInt(7, medico.getId_medico());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Medico medico) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM medico WHERE id_medico = ?");
            stmt.setInt(1, medico.getId_medico());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);

        }
    }

    public ArrayList<Medico> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Medico> listaMedicos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM medico ORDER by id_medico");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Medico medico = new Medico();
                medico.setId_medico(rs.getInt("id_medico"));
                medico.setNome(rs.getString("nome"));
                medico.setCpf(rs.getString("cpf"));
                medico.setEndereco(rs.getString("endereco"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));
                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao leitura: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return listaMedicos;
    }

    public ArrayList<Medico> getListaMedicoporNome(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Medico> listaMedicos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM medico WHERE nome ILIKE ? ORDER by id_medico");

            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Medico medico = new Medico();
                medico.setId_medico(rs.getInt("id_medico"));
                medico.setNome(rs.getString("nome"));
                medico.setCpf(rs.getString("cpf"));
                medico.setEndereco(rs.getString("endereco"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));
                listaMedicos.add(medico);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os médicos", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaMedicos;
    }

}
