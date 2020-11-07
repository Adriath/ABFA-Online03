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
    
    // Ejercicio 1. Conversor de pulgadas.
    
    /**
     * Convierte pulgadas a centímetros y viceversa.
     * 
     */
    
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
    
    // Ejercicio 2: operaciones simples
    
    /**
     * Realiza operaciones simples (suma, resta, multiplicación y división) a partir de don números introcidos por teclado.
     */
    
    public void operacionesSimples()
    {
        System.out.println("Introduce un número, por favor: ");
        Scanner teclado = new Scanner(System.in) ;
        double num1 = teclado.nextDouble() ;
        
        System.out.println("Introduce otro número, por favor: ");
        double num2 = teclado.nextDouble() ;
        
        double suma = num1 + num2 ; // suma
        double resta = num1 - num2 ; // resta
        double multiplicacion = num1 * num2 ; // multiplicación
        double division = num1 / num2 ; // división
        
        System.out.println("La suma de " + (int)num1 + " + " + (int)num2 + " es igual a = " + (int)suma);
        System.out.println("La resta de " + (int)num1 + " - " + (int)num2 + " es igual a = " + (int)resta);
        System.out.println("La multiplicación de " + (int)num1 + " * " + (int)num2 + " es igual a = " + (int)multiplicacion);
        System.out.println("La división de " + (int)num1 + " / " + (int)num2 + " es igual a = " + (int)division);
    }
    
    // Ejercicio 3: mostrar los 100 primeros números negativos.
    
    /**
     * Muestra los primeros 100 números negativos.
     */
    
    public void muestraNegativos()
    {
        System.out.println("En este programa vamos a mostrar los primeros 100 números negativos.");
        
        for (int numero = -1; numero >= -100; numero--) {
            
            System.out.print(numero + " ");
        }
    }
    
    // Ejercicio 4: comprobar positivo.
    
    /**
     * Comprueba si un número introducido por teclado es positivo o negativo.
     */
    
    public void compruebaPositivo()
    {
        int numero ;
        
        do {
            
            System.out.println("Introduce un número, por favor: ");
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            
            if (numero > 0) // Es positivo
            { 
                System.out.println("El número introducido ES POSITIVO.");
            }
            else    // es negativo
            {
                System.out.println("El número introducido ES NEGATIVO.");
            }
                
            
        } while (numero == 0);
        
    }
    
    
    public static void main(String[] args) {
        
        Ejercicio1 objeto = new Ejercicio1();
       
        objeto.compruebaPositivo();
        
        
    }
}
