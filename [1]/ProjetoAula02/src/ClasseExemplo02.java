/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ClasseExemplo02 {

    public static void main(String Args[]) {
        int ladoA = 10;
        int ladoB = 10;
        int ladoC = 5;

        if (ladoA < ladoB + ladoC || ladoB < ladoA + ladoC || ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triangulo Equilatero!");
            }
            else if ( ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Triangulo Isosceles!");
            }
            else System.out.println("Triangulo Escaleno!");
        } else {
            System.out.println("Os valores fornecidos nao geram um triangulo!");
        }

    }

}
