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
public class Boletin2Ejercicio2 {
    
    public static void solucion(){
        System.out.println("2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.");
        
        int numero = 0;
        
        while(true){
            System.out.printf("%nEscribe un numero y te dire si es positivo o negativo (Para salir escribe 0) : ");
            numero = Entrada.entero();
            if(numero == 0) break;
            System.out.printf("El numero %d es %s %n", numero, (numero < 0) ? "Negativo" : "Positivo");
        }
        
        System.out.println("Programa Finalizado");
        
    }
    
}
