
import java.util.Calendar;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class manipulaData {
    
    public static void main(String Args[]){
         Date d = new Date();
         
         System.out.println(d);
         
         Calendar cal = Calendar.getInstance();
         
         int ano = cal.get(Calendar.YEAR);
         int mes = cal.get(Calendar.MONTH);
         int dia = cal.get(Calendar.DAY_OF_MONTH);
         int hora = cal.get(Calendar.HOUR_OF_DAY);
         int minuto = cal.get(Calendar.MINUTE);
         int segundo = cal.get(Calendar.SECOND);
         
         
         System.out.printf("Data e hora atual: %d/%d/%d %d:%d:%d\n", dia,mes+1,ano,hora,minuto,segundo);
         
         
         
         
    }
    
}
