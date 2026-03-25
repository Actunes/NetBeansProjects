
import java.text.SimpleDateFormat;
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
public class BoasVindasCalendar {

    public static void main(String args[]) {
        Calendar c1 = Calendar.getInstance();

        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(hoje));

    }

}
