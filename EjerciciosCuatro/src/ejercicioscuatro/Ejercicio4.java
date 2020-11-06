/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    //1.Inicio
    public static void main(String[] args) {  
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2.costo del CPU, d[0,n]
        double costo_del_CPU;
        //3.costo del teclado, d[0,n]
        double costo_del_teclado;
        //4.costo de la pantalla, d[0,n]
        double costo_de_la_pantalla;
        //5.costo del ratón, d[0,n]
        double costo_del_ratón;
        //6.costo total de la computadora, d[0,n]
        double costo_total_de_la_computadora;
        
        //pido datos por teclado - entrada
        //7.Escribir "Ingrese el costo del CPU"
        System.out.println("Ingrese el costo del CPU");
        //8. Leer costo del CPU
        costo_del_CPU = entrada.nextDouble();
        //9.Escribir "Ingrese el costo del teclado"
        System.out.println("Ingrese el costo del teclado");
        //10. Leer costo del teclado
        costo_del_teclado = entrada.nextDouble();
        //11.Escribir "Ingrese el costo de la pantalla"
        System.out.println("Ingrese el costo de la pantalla");
        //12. Leer costo de la pantalla
        costo_de_la_pantalla = entrada.nextDouble();
        //13.Escribir "Ingrese el costo del ratón"
        System.out.println("Ingrese el costo del ratón");
        //14. Leer costo del ratón
        costo_del_ratón = entrada.nextDouble();
        
        //proceso
        //15.costo total de la computadora <-- costo del CPU + costo del teclado
        //+ costo de la pantalla + costo del ratón
        costo_total_de_la_computadora = costo_del_CPU + costo_del_teclado + 
                costo_de_la_pantalla + costo_del_ratón;
        
        //salida
        //16.Escribir "El costo total de la computadora es:" + costo_total_de_la 
        //computadora
        System.out.printf("El costo total de la computadora es : %.2f/n", 
                costo_total_de_la_computadora);
    }//17.Fin
    
}
