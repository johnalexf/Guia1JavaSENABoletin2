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
public class Boletin2Ejercicio21 {
 
    
    public static void solucion(){
    
        System.out.println("21.Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.");
        
        boolean hayNegativos = false;
        
        for(int i=1; i<= 10; i++){
            System.out.printf("Introduce el %d numero entero, puede ser positivo o negativo : ",i);
            int numero = Entrada.entero();
            
            if (numero < 0 && !hayNegativos) 
                hayNegativos = true;
            
        }
        
        System.out.printf("%n %s has introducido numeros negativos %n%n", (hayNegativos) ? "SI" : "NO");
    }
}
