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
public class Boletin2Ejercicio23 {
 
    public static void solucion(){
    
        System.out.println("23.Pedir 5 números e indicar si alguno es múltiplo de 3.");
        
        boolean multiploDe3 = false;
        
        System.out.println("Escribe 5 numeros y te dire si alguno es multiplo de 3");
        
        for(int i=1; i<=5 ; i++){
            System.out.printf("Escriba el #%d : ",i);
            int numero = Entrada.entero();
            
            if( !multiploDe3 && numero%3 == 0)
                multiploDe3 = true;
        }
        
        System.out.printf("%n De los 5 numeros %s hay alguno que es multiplo de 3 %n%n", 
                            (multiploDe3) ? "SI" : "NO"
                );
        
    }
}
