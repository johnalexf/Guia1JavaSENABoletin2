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
public class Boletin2Ejercicio16 {
    
    public static void solucion(){
        System.out.println("16.Pide un número (que debe estar entre 0 y 10) "
                + "\n y mostrar la tabla de multiplicar de dicho número.");
        
        int numero = 0;
        
        System.out.println("\nDigita un numero entre 0 y 10 y te dire su tabla de multiplicar");
        numero = Entrada.entero();
        
        while( numero < 0 || numero > 10){
            System.err.println("Ingresa un numero entre 0 y 10");
            numero = Entrada.entero();        
        }
        
        System.out.printf("%n Tabla de multiplicar de %d %n", numero);
        for(int i=1 ; i<=10 ; i++){
            System.out.printf("     %d  X  %02d  =  %02d  %n", numero, i, numero*i);
        }
        
    }
     
}
