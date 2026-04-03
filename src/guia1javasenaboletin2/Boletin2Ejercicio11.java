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
public class Boletin2Ejercicio11 {
    
    public static void solucion(){
    
        System.out.println("11.Diseñar un programa que muestre el producto de los 10 primeros números impares.");
        
        ArrayList<Integer> listaNumerosImpares = new ArrayList<>();
        int numeroImpar = 1, cantidadImpares = 10;
        long productoTotal=1;
        
        for(int i=1; i<= cantidadImpares; i++){
           
            listaNumerosImpares.add(numeroImpar);
            productoTotal *= (long) numeroImpar;
            numeroImpar += 2;
                
        }
        
        
        System.out.printf("%nLos primeros %d numeros impares son:%n"
                + "%s%n"
                + "Y el producto entre ellos es igual a %d%n",
                cantidadImpares,
                listaNumerosImpares,
                productoTotal
        );
        
        
    }
    
}
