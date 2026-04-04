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
public class Boletin2Ejercicio22 {
    
    public static void solucion(){
    
        System.out.println("22.Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.");
        
        int notaSuspenso = 4; //Por debajo de 4 se considera suspenso;
        boolean haySuspenso = false;
        
        System.out.println("Escriba la calificacion final de 5 alumnos");
        
        for(int i=1; i<=5 ; i++){
            
            int nota;
            while(true){
                System.out.printf("Escriba la nota del %d estudiante : ", i);
                nota = Entrada.entero();
                if(nota >= 0 && nota <= 10)
                    break;
                System.err.println("La nota debe estar entre 0 y 10");
            }
            
            if(!haySuspenso && nota <= notaSuspenso)
                haySuspenso = true;
           
        }
        
        System.out.printf("%n %s hay algun suspenso %n%n", (haySuspenso)? "SI":"NO");
    
    }
    
}
