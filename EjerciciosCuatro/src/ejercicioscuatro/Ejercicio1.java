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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    //1.Inicio
    public static void main(String[] args) {
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. base, d[0,n]
        double base;
        //3. altura, d[0,n]
        double altura;
        //4. area, d[0,n]
        double area;
        
        //pido datos por teclado - entrada
        //5.Escribir "Ingrese la base del triangulo"
        System.out.println("Ingrese la base del triangulo");
        //6. Leer base
        base = entrada.nextDouble();
        //7.Escribir "Ingrese la altura del triangulo"
        System.out.println("Ingrese la altura del triangulo");
        //8. Leer altura
        altura = entrada.nextDouble();
        
        //proceso
        //9. area <-- base * altura/2
        area = base * altura/2;
        
        //salida
        //10.Escribir "el area del triangulo es:" + area_del_triangulo
        System.out.printf("El area del triangulo es : %.2f/n" , area);
        //11.Fin
                
          
                
    }
    
}
