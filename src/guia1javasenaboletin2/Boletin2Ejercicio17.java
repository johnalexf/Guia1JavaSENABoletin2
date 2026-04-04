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
public class Boletin2Ejercicio17 {
    
    public static void solucion(){
    
        System.out.println("Una empresa que se dedica a la venta de desinfectantes necesita un programa \n"
                         + "para gestionar las facturas. En cada factura figura: el código del artículo, \n"
                         + "la cantidad vendida en litros y el precio por litro. \n" 
                         + "Se pide de 5 facturas introducidas: Facturación total, \n"
                         + "cantidad en litros vendidos del artículo 1 \n" 
                         + "y cuantas facturas se emitieron de más de 600 €.\n");
        
        int[] codigoArticulos = new int[]{1,2,3,4,5};
        int valorFacturaEvaluar = 600; //Euros
        
        int  cantFacturasMayor=0 ;
        double facturacionTotal=0 , litrosVendidosArt1=0 ;
        
        
        for(int i=1; i<=5; i++){
            
            int codigoArticulo, precioLitro;
            double litros, totalFacturaActual;
            
            System.out.printf("%nIngresa los datos para la factura # %d %n",i);
            
            while(true){
                
                System.out.printf("Seleccione el codigo del articulo: %n");
                System.out.printf("   Codigo   -    Nombre del articulo %n");
                for( int j=0;   j < codigoArticulos.length; j++ )
                    System.out.printf("     %02d     -    articulo%d%n", j+1, codigoArticulos[j] );
                
                System.out.printf("Digite el codigo del articulo :  ");
                codigoArticulo = Entrada.entero();
                if(verificarContenido(codigoArticulos, codigoArticulo))
                    break;
                
                System.err.println("El codigo del articulo no existe, intentelo de nuevo");
            
            }
            
            System.out.println("Escriba la cantidad de litros vendidas");
            litros = Entrada.real();
            
            System.out.println("Escriba el precio por litro en Euros");
            precioLitro = Entrada.entero();
            
            totalFacturaActual = litros*precioLitro;
            
            System.out.printf("%nResumen de factura # %d %n", i);
            System.out.printf("Articulo vendido: articulo%d %n", codigoArticulo);
            System.out.printf("Cantidad de litros vendidos: %.2f %n", litros);
            System.out.printf("Precio por litro: %d %n", precioLitro);
            System.out.printf("Total factura: %.2f %n%n", totalFacturaActual);
            
            facturacionTotal+= totalFacturaActual;
            if( codigoArticulo==1 )
                litrosVendidosArt1 += litros;
            if(totalFacturaActual > valorFacturaEvaluar)
                cantFacturasMayor++;
        
        }
        
        System.out.printf("%n%n El analisis de las 5 facturas es el siguiente: %n");
        System.out.printf("Valor de facturacion total = %.2f %n", facturacionTotal);
        System.out.printf("Litros vendidos del articulo1 = %.2f %n", litrosVendidosArt1);
        System.out.printf("Facturas por encima de %d = %d %n%n", valorFacturaEvaluar, cantFacturasMayor);
        
        
    }
    
    
    public static boolean verificarContenido( int[] array, int verificador){
        
        for(int k=0; k<array.length ; k++){
            if(array[k] == verificador)
                return true;
        }
        return false;
    }
    
}
