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
public class Boletin2Ejercicio3 {
    
    public static void solucion(){
    
        System.out.println("3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.");
        
        int numero = 1;
        
        while(true){
            System.out.printf("%nEscribe un numero ENTERO y te dire si es par o impar :  ");
            numero = Entrada.entero();
            if(numero == 0) break;
            System.out.printf("El numero %d es %s %n",numero, (numero%2 == 0)? "par" : "impar");
        }
        
        System.out.println("Fin del programa");
    
    }
    
}
