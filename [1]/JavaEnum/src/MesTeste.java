/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

import java.util.Scanner;
public class MesTeste {
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o mes desejado: ");
        String mesDesejado = ler.nextLine();
        Mes m = Mes.valueOf(mesDesejado.toUpperCase());
        System.out.println(m);
        System.out.println(m.getNumero());
    }
    
}
