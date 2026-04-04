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
public class Boletin2Ejercicio13 {
    
    public static void solucion(){
    
        System.out.println("13.Pedir 10 números. "
                + "\nMostrar la media de los números positivos, "
                + "\nla media de los números negativos "
                + "\ny la cantidad de ceros."
        );
        
        int numero, cantidadCeros=0, cantidadNumeros = 10;
        int[] sumas = new int[2]; //Posicion 0 para positivos, 1 para negativos
        ArrayList<Integer> listaNumPositivos = new ArrayList<>(), 
                           listaNumNegativos = new ArrayList<>();
       ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
       String[] nombres = new String[]{"Positivos","Negativos"};
        
        for(int i=1; i <= cantidadNumeros ; i++){
        
            System.out.printf("Digita el %d numero = ", i);
            numero = Entrada.entero();
            
            if(numero < 0){
                listaNumNegativos.add(numero);
                sumas[1] += numero;
            }else if(numero > 0){
                listaNumPositivos.add(numero);
                sumas[0] += numero;
            }else
                cantidadCeros++;
        
        }
        
        matriz.add(listaNumPositivos);
        matriz.add(listaNumNegativos);
        
        for(int i=0; i < 2; i++){
            if(!matriz.get(i).isEmpty()){
                System.out.printf("%nLos numeros %s que ingresaste son:"
                            +"%n%s"
                            +"%nSu media es igual a: %.2f %n",
                            nombres[i],
                            matriz.get(i),
                            (double) sumas[i]/matriz.get(i).size()
                );  
            }else
                System.out.printf("%nNo ingresaste ningun numero %s",nombres[i]);
        }
            
        System.out.printf("%nIngresaste %d Ceros%n",cantidadCeros);
        
    }
    
}
