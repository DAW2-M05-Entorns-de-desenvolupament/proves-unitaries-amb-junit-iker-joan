/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provajunit;

/**
 *
 * @author alumne
 */
public class Programa {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        
        int resultat = calc.suma(2,3);
        System.out.println(resultat);
        int resultat2 = calc.resta(2,3);
        System.out.println(resultat2);
    }
    
}
