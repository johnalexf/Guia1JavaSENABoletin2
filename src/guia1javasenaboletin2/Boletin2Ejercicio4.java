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
public class Boletin2Ejercicio4 {
    
    public static void solucion(){
        System.out.println("4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.");
    
        int numero = 0, contador = 0;
        
        while(true){
            System.out.printf("%nEscriba un numero Entero y te ire contando cuantos has introducido (Para terminar ingresa un numero negativo) : ");
            numero = Entrada.entero();
            
            if(numero < 0 ) break;
            
            System.out.printf("Llevas introducidos %d numeros %n", ++contador);
        
        }
        
        System.out.printf("%nIngresaste un total de %d numeros validos%n", contador);
        System.out.println("Programa Finalizado");
    }
    
}
