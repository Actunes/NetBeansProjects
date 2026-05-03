/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.bean.Aluno;
import model.dao.AlunoDao;

/**
 *
 * @author Aluno
 */
public class AlunoController {

    public boolean create(String nome, String endereco, String fone, String email, String matricula, String curso) {
        Aluno aluno = new Aluno();
        AlunoDao alunoDao = new AlunoDao();

        aluno.setNome(nome);
        aluno.setEndereco(endereco);
        aluno.setFone(fone);
        aluno.setEmail(email);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);

        return alunoDao.create(aluno);
    }

    public boolean update(int idaluno, String nome, String endereco, String fone, String email, String matricula, String curso) {
        Aluno aluno = new Aluno();
        aluno.setId(idaluno);
        aluno.setNome(nome);
        aluno.setEndereco(endereco);
        aluno.setFone(fone);
        aluno.setEmail(email);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);

        AlunoDao alunoDao = new AlunoDao();
        return alunoDao.update(aluno);
    }

    public boolean delete(int idaluno) {
        Aluno aluno = new Aluno();
        aluno.setId(idaluno);

        AlunoDao alunoDao = new AlunoDao();
        return alunoDao.delete(aluno);
    }

    public ArrayList<Aluno> read() {
        AlunoDao alunoDao = new AlunoDao();
        return alunoDao.read();
    }
}
