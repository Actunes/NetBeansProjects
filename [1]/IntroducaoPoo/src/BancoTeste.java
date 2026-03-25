/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */

import java.util.Scanner;

public class BancoTeste {
    
    public static void main(String[] args){

        Banco conta1 = new Banco("Jose da silva", 120, 200);
        System.out.println(conta1);
        conta1.setNomeTitular("Novo nome");
        conta1.depositarSaldo(40);
        System.out.println(conta1);
        
        System.out.println("=====================");
        
        Banco conta2 = new Banco("Nome", 121);
        System.out.println(conta2);
        conta2.sacarSaldo(23);
        System.out.println(conta2);
        
    }
    
}
