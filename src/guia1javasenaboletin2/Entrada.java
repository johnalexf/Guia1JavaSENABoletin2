/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javasenaboletin2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author johna
 */
public class Entrada {
    
    private static final BufferedReader acumuladorTeclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static String lecturaTeclado(){
        
        try {
            return acumuladorTeclado.readLine();
        } catch (IOException e) {
            System.err.println("Error en la lectura del mensaje");
            return "";
        }
 
    }
    
    static int entero(){
        
        while(true){
            try {
                return Integer.parseInt(lecturaTeclado());
            } catch (NumberFormatException e) {
                System.err.printf("%nError no digitaste un numero ENTERO%n");
                System.out.printf("Porfavor escriba un numero ENTERO segun lo solicitado = ");
            }
        }
        
    }
    
    static Double real(){
        
        while(true){
            try {
                return Double.parseDouble(lecturaTeclado());
            } catch (NumberFormatException e) {
                System.err.printf("%nError no digitaste un numero DECIMAL%n");
                System.out.printf("Porfavor escriba un numero DECIMAL segun lo solicitado = ");
            }
        }
    
    }
    
    static String texto(){
        
        String texto = lecturaTeclado();
        while(texto.trim().isEmpty()){ // Opcional: valida que no sea solo espacios o vacío
            System.err.println("El texto no puede estar vacío.");
            System.out.printf("Por favor escriba un TEXTO segun lo solicitado = ");
            texto = lecturaTeclado();
        }
        return texto.trim();
 
    }
    
     static char caracter(){
        
        while(true){
            try {
                String entrada = lecturaTeclado().trim();
                if (entrada.length() == 1) {
                    return entrada.charAt(0);
                } else {
                    System.err.println("Error: debes escribir exactamente UN caracter.");
                    System.out.print("Intenta de nuevo :  ");
                }
            } catch (Exception e) { // Cambiamos a Exception para capturar si está vacío
                System.err.printf("%nError al capturar el caracter%n");
                System.out.printf("Por favor escriba un CARACTER segun lo solicitado = ");
            }
        }
 
    }
    
    
}
