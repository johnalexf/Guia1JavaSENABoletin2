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
public class Boletin2Ejercicio7 {
    
    public static void solucion(){
        System.out.println("7. Pedir números hasta que se introduzca uno negativo, y calcular la media.");
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numero, suma=0, contador=0;
        double media=0;
        
        while(true){
            System.out.printf("%nDigite un numero Entero Positivo (Para salir escriba un numero negativo) : ");
            numero = Entrada.entero();
            if(numero < 0) break;
            listaNumeros.add(numero);
            suma += numero;
            contador++;
        }
        
        if(contador != 0){
            media = ((double) suma) /((double) contador);
            System.out.printf("%nLa media de los numeros ingresados es igual a %.2f %n", media );
            System.out.printf("%nLa lista de numeros que ingresaste es %s %n", listaNumeros);
        }
        else
            System.out.println("No ingresaste ningun numero, por tanto no te puedo mostrar una lista ni la media");
    
    }
}
