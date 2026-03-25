/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class CursoAlunoTeste {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Tecnico em informatica", 24);

        Aluno aluno1 = new Aluno("Aluno 1", "000.000.000-0", curso1);
        Aluno aluno2 = new Aluno("Aluno 2", "111.111.111-1", curso1);

        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }
}
