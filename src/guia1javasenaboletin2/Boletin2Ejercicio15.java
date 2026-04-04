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
public class Boletin2Ejercicio15 {
    
    public static void solucion(){
    
        System.out.println("15.Dadas las edades y alturas de 5 alumnos, \n"
                + "mostrar la edad y la estatura media, \n"
                + "la cantidad de alumnos mayores de 18 años, \n"
                + "y la cantidad de alumnos que miden más de 1.75.");
        
        int cantidadAlumnos = 5, sumaEdades=0, cantMayorEdad18=0, cantMayorEst=0;
        int[] edades = new int[cantidadAlumnos];
        double[] alturas = new double[cantidadAlumnos];
        double sumaEstaturas=0;
        
        
        for(int i=0; i < cantidadAlumnos ; i++){
            
            System.out.printf("%nEscriba la edad del alumno %d = ",i+1);
            edades[i] = Entrada.entero();
            while( edades[i]<7 || edades[i]>26){
                System.err.println("Edad incorrecta, por favor ingresa una edad acorde a lo esperado");
                edades[i] = Entrada.entero();
            }
            sumaEdades += edades[i];
            if(edades[i]> 18)
                cantMayorEdad18++;
            
            System.out.printf("Escriba la estatura en metros del alumno %d = ",i+1);
            alturas[i] = Entrada.real();
            while( alturas[i]<1 || alturas[i]>3 ){
                System.out.println("Estatura incorrecta, por favor ingresa una estatura acorde a lo esperado");
                alturas[i] = Entrada.real();
            }
            sumaEstaturas += alturas[i];
            if(alturas[i] > 1.75)
                cantMayorEst++;
            
        }
        
        System.out.printf("%n La edad media es igual a %.2f", (double) sumaEdades/cantidadAlumnos);
        System.out.printf("%n La estatura media es igual a %.2f", (double) sumaEstaturas/cantidadAlumnos);
        System.out.printf("%n La cantidad de alumnos mayores de 18 son : %d", cantMayorEdad18);
        System.out.printf("%n La cantidad de alumnos que miden mas de 1.75mts es : %d %n", cantMayorEst);
        
        
    }
}
