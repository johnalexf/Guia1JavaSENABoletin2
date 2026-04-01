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
public class Guia1JavaSenaBoletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escriba un numero");
        Integer numero = Entrada.entero();
        System.out.println(numero);
        
        
        System.out.println("Escriba un texto");
        String mensaje = Entrada.texto();
        System.out.println(mensaje);
        
        
        System.out.println("Escriba un caracter");
        char caracter = Entrada.caracter();
        System.out.println(caracter);
        
    }
    
}
