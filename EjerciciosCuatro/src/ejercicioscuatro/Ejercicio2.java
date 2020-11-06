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
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    //1.Inicio
    public static void main(String[] args) { 
        
    //declaro las variables
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    //2. gasto primer hijo, d[0,n]
    double gasto_primer_hijo;
    //3. gasto segundo hijo, d[0,n]
    double gasto_segundo_hijo;
    //4. gasto tercer hijo, d[0,n]
    double gasto_tercer_hijo;
    //5. total gastos, d[0,n]
    double total_gastos;
    
    //pido datos por teclado - entrada
    //6.Escribir "Ingresar el gasto del primer hijo"
    System.out.println("Ingresar el gasto del primer hijo");
    //7. Leer gasto primer hijo
    gasto_primer_hijo = entrada.nextDouble();
    //8.Escribir "Ingresar el gasto del segundo hijo"
    System.out.println("Ingresar el gasto del segundo hijo");
    //9. Leer gasto segundo hijo
    gasto_segundo_hijo = entrada.nextDouble();
    //10.Escribir "Ingresar el gasto del tercer hijo"
    System.out.println("Ingresar el gasto del tercer hijo");
    //11. Leer gasto tercer hijo
    gasto_tercer_hijo = entrada.nextDouble();
    
    //proceso
    //12.Total de gastos <-- gasto primer hijo + gasto segundo hijo + gasto 
    //tercer hijo
    total_gastos = gasto_primer_hijo + gasto_segundo_hijo + gasto_tercer_hijo;
    
    //salida
    //13.Escribir "El total de gastos es:" + total_de_gastos
    System.out.printf("El total de gastos es: %2f/n" , total_gastos);
    }//14.Fin   
}
