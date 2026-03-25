/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Professor extends Funcionario {

    public Professor(int matricula, double salario, String nome, String sobrenome) {
        super(matricula, salario, nome, sobrenome);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }

}
