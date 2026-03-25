
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author igor * Construa uma classe que solicite uma frase escrita pelo
 * usuário. Peça ao usuário para escolher uma palavra da frase escrita e
 * substituí-la por outra palavra. (Utilize o método replace())
 *
 */
public class Ex16 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String fraseOriginal = ler.nextLine();

        System.out.println("Digite a palavra da frase para substituir:");
        String palavraAntiga = ler.nextLine();

        System.out.println("Digite a nova palavra:");
        String palavraNova = ler.nextLine();

        String fraseModificada = fraseOriginal.replace(palavraAntiga, palavraNova);

        System.out.println(fraseModificada);

    }
}
