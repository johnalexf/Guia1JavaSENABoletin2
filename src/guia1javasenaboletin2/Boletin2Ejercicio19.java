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
public class Boletin2Ejercicio19 {
    
    public static void solucion(){
    
        System.out.println("19.Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.");
        
        System.out.println("\nAcontinuacion escribira las notas finales de 6 estudiantes,\n"
                + "En donde el rango de notas admitidos esta entre 0 a 10");
        
        int alumnosAprobados = 0, alumnosCondicionados = 0, alumnosSuspendidos = 0;
        
        for(int i = 1; i <= 6; i++){
            int nota;
            
            while(true){
                
                System.out.printf("%nEscriba la nota del estudiante #%d :  ",i);
                nota = Entrada.entero();
                if( nota >=0 && nota<=10 )
                    break;
                System.err.println("La nota que ingresaste no es valida, intentalo de nuevo");
            
            }
            
            if(nota > 4)
                alumnosAprobados++;
            else if( nota == 4 )
                alumnosCondicionados++;
            else
                alumnosSuspendidos++;
            
        }
        
        
        System.out.println("\nResultados:");
        System.out.printf("%n Cantidad de alumnos aprobados : %d", alumnosAprobados);
        System.out.printf("%n Cantidad de alumnos condicionados : %d", alumnosCondicionados);
        System.out.printf("%n Cantidad de alumnos suspendidos : %d %n", alumnosSuspendidos);
    
    }
    
}
