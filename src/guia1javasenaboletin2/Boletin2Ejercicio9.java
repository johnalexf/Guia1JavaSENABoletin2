/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin2;

/**
 *
 * @author johna
 */
public class Boletin2Ejercicio9 {
    
    public static void solucion(){
        System.out.println("9. Escribir todos los números del 100 al 0 de 7 en 7.");
        
        for(int i=100 ; i >= 0 ;i -= 7){
            System.out.printf("  %d  |" , i);
        }
    
        System.out.println("\nFin del programa");
    }
    
}
