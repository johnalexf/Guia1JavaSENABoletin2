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
public class Boletin2Ejercicio14 {
    
    public static void solucion(){
    
        System.out.println("14.Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€");
        
        int sueldo = 0, sumaSueldos=0, cantidadesMayor=0, sueldoEvaluar=1000;
        
        for(int i=1; i<=10; i++){
            System.out.printf("%nDigita el sueldo # %d en euros = ", i);
            sueldo = Entrada.entero();
            sumaSueldos += sueldo;
            if(sueldo > sueldoEvaluar)
                cantidadesMayor++;
   
        }
        
        System.out.printf("%n La suma de los sueldos es %d %n",sumaSueldos);
        System.out.printf("%n Ingresaste %d sueldo mayores a %d %n",cantidadesMayor, sueldoEvaluar);
        
        
    }
}
