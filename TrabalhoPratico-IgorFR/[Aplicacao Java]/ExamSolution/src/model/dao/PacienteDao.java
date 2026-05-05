/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class PacienteDao {

    private Connection con = null;

    public PacienteDao() {
        con = ConnectionFactory.getConnection();
    }

    public boolean create(Paciente paciente) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO paciente (nome, cpf, endereco, telefone, datanascimento, planosaude) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getEndereco());
            stmt.setString(4, paciente.getTelefone());
            stmt.setString(5, paciente.getDatanascimento());
            stmt.setString(6, paciente.getPlanosaude());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean update(Paciente paciente) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE paciente set nome = ? , cpf = ? , endereco = ? , telefone = ? , datanascimento = ? , planosaude = ? WHERE id_paciente = ?");
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getEndereco());
            stmt.setString(4, paciente.getTelefone());
            stmt.setString(5, paciente.getDatanascimento());
            stmt.setString(6, paciente.getPlanosaude());
            stmt.setInt(7, paciente.getId_paciente());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Paciente paciente) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM paciente WHERE id_paciente = ?");
            stmt.setInt(1, paciente.getId_paciente());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);

        }
    }

    public ArrayList<Paciente> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM paciente ORDER by id_paciente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setDatanascimento(rs.getString("datanascimento"));
                paciente.setPlanosaude(rs.getString("planosaude"));
                listaPacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao leitura: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return listaPacientes;
    }

    public ArrayList<Paciente> getListaPacienteporNome(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM paciente WHERE nome ILIKE ? ORDER by id_paciente");

            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setDatanascimento(rs.getString("datanascimento"));
                paciente.setPlanosaude(rs.getString("planosaude"));
                listaPacientes.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os médicos", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaPacientes;
    }

}
