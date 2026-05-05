/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Paciente;
import model.dao.PacienteDao;

/**
 *
 * @author igor
 */
public class PacienteController {

    public boolean create(String nome, String cpf, String endereco, String telefone, String datanascimento, String planosaude) {
        Paciente paciente = new Paciente();
        PacienteDao pacienteDao = new PacienteDao();

        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setDatanascimento(datanascimento);
        paciente.setPlanosaude(planosaude);

        return pacienteDao.create(paciente);
    }

    public boolean update(int id_paciente, String nome, String cpf, String endereco, String telefone, String datanascimento, String planosaude) {
        Paciente paciente = new Paciente();
        PacienteDao pacienteDao = new PacienteDao();

        paciente.setId_paciente(id_paciente);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setTelefone(telefone);
        paciente.setDatanascimento(datanascimento);
        paciente.setPlanosaude(planosaude);

        return pacienteDao.update(paciente);
    }

    public boolean delete(int id_paciente) {
        Paciente paciente = new Paciente();
        PacienteDao pacienteDao = new PacienteDao();

        paciente.setId_paciente(id_paciente);

        return pacienteDao.delete(paciente);
    }

    public ArrayList<Paciente> read() {
        PacienteDao pacienteDao = new PacienteDao();

        return pacienteDao.read();
    }

}
