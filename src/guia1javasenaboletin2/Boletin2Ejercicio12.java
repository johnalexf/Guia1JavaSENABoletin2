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
public class Boletin2Ejercicio12 {
    
    public static void solucion(){
    
        System.out.println("12.Pedir un número y calcular su factorial.");
        int numero;
        long factorial = 1;
        
        System.out.printf("Escribe un numero y te dire su factorial = ");
        numero = Entrada.entero();
        
        for(int i = numero; i > 1 ; i--){
            factorial *= i;
        }
        
        System.out.printf("El resultado de %d! es %d%n", numero, factorial);
        
    }
    
}
