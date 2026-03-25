
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author igor
 *
 * Construa uma classe em Java que peça ao usuário para digitar um texto em
 * letras maiúsculas e mostre o texto em letra minúscula, em seguida solicite-o
 * um texto em letra minúscula e mostre-o em letra maiúsculas. (Utilize os
 * métodos toLowerCase() e toUpperCase() ).
 *
 */
public class Ex15 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String texto;

        System.out.println("Digite o texto em minuscula: ");
        texto = ler.nextLine();

        System.out.println("Texto convertido para MAISCULAS: " + texto.toUpperCase());

        System.out.println("Digite o texto em MAISCULAS: ");
        texto = ler.nextLine();

        System.out.println("Texto convertido para minusculas: " + texto.toLowerCase());

    }

}
