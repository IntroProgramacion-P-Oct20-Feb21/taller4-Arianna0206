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
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    //1.Inicio
    public static void main(String[] args) {  
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2.monto del préstamo, d[0,n]
        double monto_del_préstamo;
        //3.interés mensual a cobrar, d[0,n]
        double interés_mensual_a_cobrar;
        //4.pago mensual del préstamo en un año, d[0,n]
        double pago_mensual_del_préstamo_en_un_año;
        //5.número de meses que consta un año, i[0,n]
        int número_de_meses_que_consta_un_año;
        
        //pido datos por teclado - entrada
        //6.Escribir "Ingrese el monto del préstamo"
        System.out.println("Ingrese el monto del préstamo");
        //7. Leer monto del préstamo
        monto_del_préstamo = entrada.nextDouble();
        //8.Escribir "Ingrese el interés mensual a cobrar"
        System.out.println("Ingrese el interés mensual a cobrar");
        //9. Leer interés mensual a cobrar
        interés_mensual_a_cobrar = entrada.nextDouble();
        //10.Escribir "Ingrese el número de meses que consta un año"
        System.out.println("Ingrese el número de meses que consta un año");
        //11. Leer número de meses que consta un año
        número_de_meses_que_consta_un_año = entrada.nextInt();
        
        //proceso
        //9.pago mensual del préstamo en un año <-- monto del préstamo + 
        // interés mensual a cobrar
        pago_mensual_del_préstamo_en_un_año = monto_del_préstamo *
                interés_mensual_a_cobrar * número_de_meses_que_consta_un_año;
        
        //salida
        //10.Escribir "El pago mensual del préstamo en un año:" + pago_mensual
        //_del_préstamo_en_un_año
        System.out.printf("El pago del préstamo en un año: %.2f/n", 
                pago_mensual_del_préstamo_en_un_año);
    }//11.Fin    
    
}
