/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
import java.util.Scanner;

public class RetanguloTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a base do retangulo: ");
        int b = ler.nextInt();
        
        System.out.println("Digite a altura do retangulo: ");
        int a = ler.nextInt();
        
        Retangulo retangulo1 = new Retangulo(b, a);
        
        System.out.println(retangulo1);
        
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        
    }

}
