/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex05;

/**
 *
 * @author igor
 */
public class Quadrado implements AreaCalculavel{
    
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calculaArea(){
        return this.lado * this.lado;
    }
    
}
