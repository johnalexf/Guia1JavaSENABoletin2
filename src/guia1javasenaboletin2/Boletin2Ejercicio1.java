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
public class Boletin2Ejercicio1 {
    
    public static void solucion(){
        System.out.println("1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.");

        int numero = 0;
       
        while (true){
            System.out.printf("%nEscriba un numero entero y te dire su cuadrado (para salir escribe un numero negativo) =  ");
            numero = Entrada.entero();    
            if(numero < 0) break;  
            System.out.printf("El cuadrado del numero (%d) es = (%d) %n",numero, numero*numero);              
        }
        
        System.out.println("Fin del programa");
       
    }

}
