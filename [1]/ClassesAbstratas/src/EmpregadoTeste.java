/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class EmpregadoTeste {

    public static void main(String[] args) {
        EmpregadoAssalariado empregadoassalariado1 = new EmpregadoAssalariado(780, "Nome", "Sobrenome");
        EmpregadoHorista empregadohorista1 = new EmpregadoHorista(50, 150, "Nome2", "Sobrenome2");
        EmpregadoComissionado empregadocomissionado1 = new EmpregadoComissionado(10000, 0.05, "Nome3", "Sobrenome3");
        EmpregadoComissionadoFixo empregadocomissionadofixo1 = new EmpregadoComissionadoFixo(3000, 10000, 0.05, "Nome4", "Sobrenome4");

        System.out.println("==== Empregados PRocessados Individualmente ====");
        System.out.println(empregadoassalariado1);
        System.out.println("Ganhou:" + empregadoassalariado1.calculaSalario() + "\n");
        System.out.println(empregadohorista1);
        System.out.println("Ganhou:" + empregadohorista1.calculaSalario() + "\n");
        System.out.println(empregadocomissionado1);
        System.out.println("Ganhou:" + empregadocomissionado1.calculaSalario() + "\n");
        System.out.println(empregadocomissionadofixo1);
        System.out.println("Ganhou:" + empregadocomissionadofixo1.calculaSalario() + "\n");

        Empregado empregados[] = new Empregado[4];
        empregados[0] = empregadoassalariado1;
        empregados[1] = empregadohorista1;
        empregados[2] = empregadocomissionado1;
        empregados[3] = empregadocomissionadofixo1;

        System.out.println("==== Empregados Processados polimorficamente\n");

        for (Empregado empregadoAtual : empregados) {
            System.out.println(empregadoAtual);
            if (empregadoAtual instanceof EmpregadoComissionadoFixo) {
                EmpregadoComissionadoFixo empregado = (EmpregadoComissionadoFixo) empregadoAtual;
                double antigoSalarioFixo = empregado.getSalarioFixo();
                empregado.setSalarioFixo(1.10 * antigoSalarioFixo);
                System.out.println("Com aumento de 10%: " + empregado.getSalarioFixo());
                System.out.println("Ganhou: " + empregadoAtual.calculaSalario());
            }

        }

        for (int j = 0; j < empregados.length; j++) {
            System.out.println("Empregado " + j + " eh um " + empregados[j].getClass().getSimpleName());
        }

    }

}
