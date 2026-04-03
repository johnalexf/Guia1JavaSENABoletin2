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
public class Boletin2Ejercicio8 {
    
    public static void solucion(){
        
        System.out.println("8. Pedir un número N, y mostrar todos los números del 1 al N.");
        
        int numero; 
        
        System.out.printf("Dame un numero ENTERO y te mostrare todos los numeros que hay antes de ese:  ");
        numero = Entrada.entero();
        System.out.println("");
        
        /* 
        int acumulador = 0;
        while(acumulador < numero){
            System.out.printf("  %d  |%s",++acumulador,(acumulador%10 == 0) ? "\n":"");
        }
        */
        
        for(int i=1; i <= numero ; i++){
            System.out.printf("  %d  |%s",i,(i%10 == 0) ? "\n":"");
        }
        
        System.out.printf("%nFin del programa%n");
    
    }
    
}
