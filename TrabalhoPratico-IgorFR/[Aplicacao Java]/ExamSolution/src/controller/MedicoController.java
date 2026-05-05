/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Medico;
import model.dao.MedicoDao;

/**
 *
 * @author igor
 */
public class MedicoController {

    public boolean create(String nome, String cpf, String endereco, String telefone, String crm, String especialidade) {
        Medico medico = new Medico();
        MedicoDao medicoDao = new MedicoDao();

        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setEndereco(endereco);
        medico.setTelefone(telefone);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);

        return medicoDao.create(medico);
    }

    public boolean update(int id_medico, String nome, String cpf, String endereco, String telefone, String crm, String especialidade) {
        Medico medico = new Medico();
        MedicoDao medicoDao = new MedicoDao();

        medico.setId_medico(id_medico);
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setEndereco(endereco);
        medico.setTelefone(telefone);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);

        return medicoDao.update(medico);
    }

    public boolean delete(int id_medico) {
        Medico medico = new Medico();
        MedicoDao medicoDao = new MedicoDao();

        medico.setId_medico(id_medico);

        return medicoDao.delete(medico);
    }

    public ArrayList<Medico> read() {
        MedicoDao medicoDao = new MedicoDao();

        return medicoDao.read();
    }
    
    public ArrayList<Medico> getListaMedicosporNome(String nome){
        MedicoDao medicoDao = new MedicoDao();
        return medicoDao.getListaMedicoporNome(nome);
    }
    
}
