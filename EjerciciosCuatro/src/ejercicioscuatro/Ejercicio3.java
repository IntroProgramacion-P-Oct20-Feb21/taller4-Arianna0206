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
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    //1.Inicio
    public static void main(String[] args) {  
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2.costo por minuto, d[0,n]
        double costo_por_minuto;
        //3.número de minutos consumidos por el mes, d[0,n]
        double número_de_minutos_consumidos_por_el_mes;
        //4.valor de la planilla, d[0,n]
        double valor_de_planilla;
        
        //pido datos por teclado - entrada
        //5.Escribir "Ingrese el costo por minuto"
        System.out.println("Ingrese el costo por minuto");
        //6. Leer costo por minuto
        costo_por_minuto = entrada.nextDouble();
        //7.Escribir "Ingrese el número de minutos consumidos por el mes"
        System.out.println("Ingrese el número de minutos consumidos por el mes");
        //8. Leer número de minutos consumidos por el mes
        número_de_minutos_consumidos_por_el_mes = entrada.nextDouble();
        
        //proceso
        //9.Valor de planilla <-- costo por minuto * número de minutos 
        //consumidos por el mes
        valor_de_planilla = costo_por_minuto * 
                número_de_minutos_consumidos_por_el_mes;
        
        //salida
        //10.Escribir "El valor de planilla es:" + valor_de_planilla
        System.out.printf("El valor de planilla es : %.2f/n", valor_de_planilla);
        }//11.Fin  
}
