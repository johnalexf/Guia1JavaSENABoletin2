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
public class Boletin2Ejercicio10 {
    
    public static void solucion(){
        System.out.println("10.Pedir 15 números y escribir la suma total.");
        
        System.out.println("Acontinuacion te pedire 15 numeros y al final te mostrare la suma total de ellos");
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numeroIngresado = 0,suma = 0;
        
        for(int i = 1; i <= 15; i++){
            System.out.printf("Ingrese el %d numero ", i);
            numeroIngresado = Entrada.entero();
            suma += numeroIngresado;
            listaNumeros.add(numeroIngresado);
        }
        
        System.out.printf("La suma de los numeros"
                        + "%n%s"
                        + "%nsuma = %d%n",
                        listaNumeros,
                        suma               
        );
        

    }
    
}
