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
public class Boletin2Ejercicio20 {
    
    public static void solucion(){
    
        System.out.println("20.Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.");
        
        int numSueldos;
        double sueldoMax=0;
        
        while(true){
            System.out.print("Escribe el numero de sueldos a analizar : ");
            numSueldos = Entrada.entero();
            if (numSueldos > 0) 
                break;
            System.err.println("El numero no puede ser negativo ni cero");          
        }
        
        
        for(int i=1; i <= numSueldos; i++){
            double sueldo;
            while (true) {                
                System.out.printf("Escriba el sueldo #%d : ",i);
                sueldo = Entrada.real();
                if(sueldo > 0)
                    break;
                System.err.println("El sueldo no puede ser negativo ni cero");
            }
            
            
            if(sueldo > sueldoMax)
                sueldoMax=sueldo;
        }
        
        System.out.printf("%n El sueldo maximo es : %.2f %n%n", sueldoMax);
    }
    
}
