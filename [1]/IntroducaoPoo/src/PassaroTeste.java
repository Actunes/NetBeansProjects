/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

import java.util.Scanner;

public class PassaroTeste {
    
    public static void main(String[] args){
        Passaro p1 = new Passaro();
        p1.corPenas = "Branco";
        p1.formatoBico = "Longo";
        p1.peso = 4;
        p1.velocidadeVoo = "20";
        
        System.out.println(p1);
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe numero de vzs que o passaro ira piar: ");
        int vezes = ler.nextInt();
        
        p1.piar(vezes);
        
        
    }
    
}
