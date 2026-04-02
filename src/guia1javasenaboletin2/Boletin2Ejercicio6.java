/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin2;

import java.util.ArrayList;

/**
 *
 * @author johna
 */
public class Boletin2Ejercicio6 {
    
    public static void solucion(){
        System.out.println(" Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.");
    
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numero, sumaNumeros = 0;
        
        while(true){
            System.out.printf("%n Escribe un numero y te los ire sumando (para terminar escribe 0): ");
            numero = Entrada.entero();
            if(numero == 0) break;
            
            sumaNumeros += numero;
            listaNumeros.add(numero);
        
        }
        
        System.out.printf("%nLa suma total de los numeros es = %d %n",sumaNumeros);
        System.out.printf("%nLos numeros que digitaste son = %s %n",listaNumeros);
        
        
        System.out.printf("%nFin del programa%n");
        
    }
    
}
