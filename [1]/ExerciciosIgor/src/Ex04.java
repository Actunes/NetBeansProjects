
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author igor
 *
 * Faça um algoritmo que receba o salário base de determinado funcionário,
 * calcule e mostre o seu salário a receber, sabendo-se que o funcionário tem
 * gratificação de R$50,00 e paga imposto de 10% sobre o salário base.
 *
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double salFuncionario;
        double salImposto;

        System.out.println("Digite o salario base do funcionario: ");
        salFuncionario = ler.nextDouble();

        salImposto = salFuncionario * 0.10;

        System.out.println("Valor apos reajuste: " + ((salFuncionario - salImposto) + 50));

    }

}
