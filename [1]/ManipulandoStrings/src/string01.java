
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class string01 {
    
    
    public static void main(String args[]){
        

        System.out.printf("%d%n", 10000L);
        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);    
        
        System.out.printf("%f%n", 5.1473);
        System.out.printf("'%5.2f'\n", 5.1473);
        
    }
    
}
