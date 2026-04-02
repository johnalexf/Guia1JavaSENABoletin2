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
public class Boletin2Ejercicio5 {
    
    public static void solucion(){
    
        System.out.println("Realizar un juego para adivinar un número. "
                          + "Para ello pedir un número N, y luego ir pidiendo números \n" 
                          + "indicando “mayor” o “menor” según sea mayor o menor con respecto a N.  \n" 
                          + "El proceso termina cuando el usuario acierta.");
        
        int numeroAdivinar = 0, numeroPrueba = 0, limiteInferior = 0, limiteSuperior;
        double numeroRandom;
        
        System.out.printf("%nEscriba el numero hasta el rango que quieres que alguien adivine el numero: ");
        limiteSuperior = Entrada.entero();
        
        numeroRandom = Math.round(Math.random()*(limiteSuperior - limiteInferior ) + limiteInferior)  ;
        numeroAdivinar = (int) numeroRandom;
        
        while(true){
            System.out.printf("%nEscribe un numero y te dire si estas por encima o por debajo : ");
            numeroPrueba = Entrada.entero();
            if(numeroAdivinar == numeroPrueba) break;
            System.out.printf("El numero %d es %s %n", numeroPrueba, (numeroPrueba < numeroAdivinar)? "Menor" : "Mayor");
        }
        
        System.out.printf("%nFelicidades adivinaste el numero%n");
        System.out.printf("El numero es %d %n", numeroAdivinar);
        
        System.out.println("Fin del programa");
        
        
    }
    
    
}
