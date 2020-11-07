/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 * A partir de la tarea online creada en la unidad didáctica 2, crea diferentes
 * métodos, unos por ejercicio, que reciban como parámetros los datos que sean 
 * necesarios para resolver el problema planteado y devuelvan el resultado.
 * Debes de:
 * 
 * 1. Elegir correctamente los nombres de los métodos para que sean descriptivos.
 *  Recuerda que deben comenzar por una letra minúscula y si tiene más de dos
 *  palabras la inicial de la segunda, y sucesivas, estará en mayúscula.
 * 
 * 2. Crea un menú en el método principal que permita llamar a cada uno de los
 *  métodos generados con los parámetros que necesiten y que muestre el resultado
 *  devuelto por el método. Este menú se mostra´ra después de cada llamada a un
 *  método hasta que se pulse el número 0 que nos permitirá salir del mismo.
 * 
 * 3. Utiliza try-catch para catpurar las posibles excepciones que se pueden dar.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class Ejercicio1 {
    
    // Conversor de pulgadas
    
    public void conversorPulgadas()
    {
        System.out.println("Bienvenido/a al conversor de pulgadas<-->centímetros.");
        System.out.println("Escoge una opción, por favor: \n\n1:Centímetros --> Pulgadas \n2: Pulgadas --> Centímetros \n");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        
        switch (opcion){
            
            case 1: //conversión de centímetros a pulgadas
                
                System.out.println("Introduce los centímetros: ");
                double cm = teclado.nextDouble() ;
                
                double pulgadas = cm / 2.54 ;
                
                System.out.println(cm + " centímetros son: " + pulgadas + " pulgadas.");
                
                break;
                
            case 2: //conversión de pulgadas a centímetros
                
                System.out.println("Introduce las pulgadas: ");
                pulgadas = teclado.nextDouble() ;
                
                cm = pulgadas * 2.54 ;
                
                System.out.println(pulgadas + " pulgadas son: " + cm + " centímetros.");
                
                break;
        }
    }
    
    public void prueba(){
        System.out.println("Si ves esto es que funciona.");
    }
    
    
    public static void main(String[] args) {
        
        Ejercicio1 conversor = new Ejercicio1();
       
        conversor.conversorPulgadas();
        
        
    }
}
