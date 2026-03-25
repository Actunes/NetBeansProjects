/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClasseExercicio5 {

    public static void main(String[] args) {

        double valorFloat;
        int valorInt;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor Nao Inteiro: ");
        valorFloat = ler.nextDouble();

        System.out.println("Digite o valor Inteiro: ");
        valorInt = ler.nextInt();

        System.out.println("Multiplicacao dos 2 valores: " + (valorFloat * valorInt));

    }

}
