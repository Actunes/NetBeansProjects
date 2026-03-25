/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = checkMes(mes);
        this.ano = ano;
    }

    private int checkMes(int mes) {
        if (mes > 0 && mes < 13) {
            return mes;
        } else {
            System.out.println("Mes invalido: " + mes);
            return -1;
        }
    }
    
    private int checkDia(int dia) {
        int diasPorMes [] = {0, 31, 28, 31, 30, 31, 30 ,31, 31 ,30, 31, 30};
        if (dia > 0 && dia <= diasPorMes[this.mes])
            return dia;
        else {
            System.out.println("Dia invalido: " + dia);
            return -1;
        }
    }
    
    @Override
    
    public String toString(){
        return String.format("%d %d %d", dia, mes, ano);
    }

}
