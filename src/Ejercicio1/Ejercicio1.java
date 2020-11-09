/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.*;

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
    
        public static void main(String[] args) {
        
        int opcion ;
        boolean validador = false ;
        
        Scanner teclado = new Scanner(System.in);
        Ejercicio1 objeto = new Ejercicio1();
        
        try
        {
            while (validador == false)
            {
            System.out.println("\nElige una de las siguientes opciones: ");
            System.out.println("\n 1: Conversor pulgadas <--> centímetros."
                + "\n 2: Suma, resta, multiplica y divide un número."
                 + "\n 3: Muestra los primeros 100 números negativos."
                + "\n 4: Comprueba si un número es positivo."
                + "\n 5: Muestra los 10 siguientes números pares."
                + "\n 6: Sumar o restar dos números."
                + "\n 7: Divide 100 sucesivas veces."
                + "\n 8: Muestra los primeros 50 números impares."
                + "\n 9: Indica si un número es par o impar."
                + "\n 0: Salir del programa.");
        
            opcion = teclado.nextInt();
             
                switch (opcion)
                {
                case 1: // conversor de pulgadas


                    System.out.println("Bienvenido/a al conversor de pulgadas<-->centímetros.");
                    System.out.println("Escoge una opción, por favor: "
                            + "\n\n1:Centímetros --> Pulgadas \n2: Pulgadas --> Centímetros \n");

                    opcion = teclado.nextInt();

                    objeto.conversorPulgadas(opcion);


                    break;

                case 2: // operaciones simples

                    System.out.println("Vamos a realizar operaciones simples a "
                            + "partir de dos números.\n");
                    System.out.println("Introduce un número, por favor: ");
                    double num1 = teclado.nextDouble();

                    System.out.println("Introduce otro número, por favor: ");
                    double num2 = teclado.nextDouble();

                    objeto.operacionesSimples(num1, num2);

                    break;

                case 3: // muestra negativos

                    objeto.muestraNegativos();

                    break;

                case 4: // comprueba si es positivo.

                    System.out.println("Vamos a comprobar si un número es positivo. \n");
                    System.out.print("Introduce un número, por favor: ");

                    int num = teclado.nextInt();

                    objeto.compruebaPositivo(num);

                    break;

                case 5: // 10 siguientes números pares

                    System.out.println("Vamos a mostrar los 10 siguientes números "
                            + "pares a partir de un número introducido. \n");
                    System.out.print("Introduce un número, por favor: ");

                    num = teclado.nextInt();

                    objeto.muestraPares(num);

                    break;

                case 6: // menú para sumar o restar dos números dados.

                    System.out.println("Vamos a realizar una operación a partir de dos números. \n");

                    System.out.print("Introduce un número, por favor: ");
                    num1 = teclado.nextInt();

                    System.out.print("Ahora introduce el número con el que operará: ");
                    num2 = teclado.nextInt();

                    objeto.menuSumaResta((int)num1, (int)num2);

                    break;

                case 7: // división infinita.

                    System.out.println("Vamos a dividir el número 100 entre un "
                            + "número introducido por teclado.");
                    System.out.print("Introduce un número, por favor: ");

                    double numeroUsuario = teclado.nextDouble();

                    objeto.cienEntreNumero(numeroUsuario);

                    break;

                case 8: // muestra impares

                    objeto.muestraImpares();

                    break;

                case 9: // saber si un número es par o impar.

                    System.out.println("Vamos a averiguar si el número introducido"
                            + " es par o impar.\n");
                    System.out.print("Introduce un número, por favor: ");
                    num = teclado.nextInt();

                    objeto.esParImpar(num);

                    break;

                case 0: // salir del programa

                    System.out.println("Has salido del programa.");
                    validador = true;

                    break;

                default:

                    System.out.println("Introduce una opción válida.");

                }
            }
        }
     
        catch(ArithmeticException e){
            System.err.println("No puedes dividir entre 0.");
        }
        
        catch(InputMismatchException e){
            System.err.println("Has introducido un valor no válido. Quizás hayas"
                    + " introducido una letra, un decimal u otro valor no válido.");
        }
        
        catch(Exception e){
            System.err.println("Has introducido un valor no permitido.");
     }
    }
    
    // Ejercicio 1. Conversor de pulgadas.
    
    /**
     * Convierte pulgadas a centímetros y viceversa.
     * 
     * @param opcion opción del menú que seguirá el conversor.
     */
    
    public void conversorPulgadas(int opcion)
    {
        
        Scanner teclado = new Scanner(System.in);
        

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

                default:

                    System.out.println("Introduce una de las dos opciones.");

                    break;
            }
        
        
    }
    
    // Ejercicio 2: operaciones simples
    
    /**
     * Realiza operaciones simples (suma, resta, multiplicación y división) a partir de dos números introducidos por teclado.
     * @param num1 primer número para realizar las operaciones.
     * @param num2 segundo número para realizar las operaciones.
     */
    
    public void operacionesSimples(double num1, double num2)
    {
        
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
        System.out.println("En este programa vamos a mostrar los primeros 100 números negativos.\n");
        
        for (int numero = -1; numero >= -100; numero--) {
            
            System.out.print(numero + " ");
        }
    }
    
    // Ejercicio 4: comprobar positivo.
    
    /**
     * Comprueba si un número introducido por teclado es positivo o negativo.
     * @param num Número a comprobar.
     */
    
    public void compruebaPositivo(int num)
    {
        
            if (num > 0) // Es positivo
            { 
                System.out.println("El número introducido ES POSITIVO.");
            }
            else if(num == 0)
            {
                System.out.println("El 0 no es válido.");
            }
            else    // es negativo
            {
                System.out.println("El número introducido ES NEGATIVO.");
            }
        
    }
    
    // Ejercicio 5: 10 primeros números pares.
    
    /**
     * Muestra los 10 siguientes números pares a partir de un número introducido
     * por teclado.
     * @param num Número a partir del que se mostrarán los pares.
     */
    
    public void muestraPares(int num)
    {
        
        for (int i = 0; i < 10; i++) {
            
            if (num %2 == 0) // si el número es par
            {
                System.out.print((num + 2) + " ");
                num += 2 ;
            }
            else    // si el número es impar
            {
                System.out.print((num + 1) + " "); 
                num += 2 ;
            }
        }
    }
    
    // Ejercicio 6: menú que suma o resta.
    
    /**
     * Mediante un menú, suma o resta dos números introducidos por teclado.
     * @param num1 primer número a sumar/restar.
     * @param num2 segundo número a sumar/restar.
     */
    
    public void menuSumaResta(int num1, int num2)
    {
        int suma , resta ;
        int opcion ;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\nElige una de las siguientes opciones: "
        + "\n 1 --> Se realiza la SUMA de ambos números."
        + "\n 2 --> Se realiza la RESTA de ambos números.");
        opcion = teclado.nextInt();
        
        switch (opcion)
        {
            case 1:
                
                suma = num1 + num2 ;
                
                System.out.println("La SUMA de los dos números es: " + suma);
                break;
                
            case 2:
                
                resta = num1 - num2 ;
                
                System.out.println("La RESTA de los dos números es: " + resta);
                break;
                
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }
    
    // Ejercicio 7: división infitina.
    
    /**
     * Partiendo de 100 dividirá por cada número introducido por el usuario.
     * La ejecución termina cuando divide entre 0.
     * @param numeroUsuario Número que dividirá a 100 y sucesivos.
     */
    
    public void cienEntreNumero(double numeroUsuario)
    {
        double numero = 100 ;
        double resultado ; 
        
        Scanner teclado = new Scanner(System.in);
        
        while (numeroUsuario != 0)
        {
            resultado = numero / numeroUsuario ;
            
            if (resultado %2 == 0) {
                
                System.out.println((int)numero + "/" + (int)numeroUsuario + " = " + (int)resultado);
            }
            else{
                
                System.out.println((int)numero + "/" + (int)numeroUsuario + " = " + resultado);
            }
            
            numero = resultado ;
            
            System.out.print("Introduce otro número, por favor: ");
            numeroUsuario = teclado.nextDouble();
        }
        
        System.out.println("La división por cero no se puede realizar.");
    }
    
    // Ejercicio 8: muestra 50 primeros impares.
    
    /**
     * Muestra los 50 primeros números impares.
     */
    
    public void muestraImpares()
    {
        int numero = 1 ;
        
        System.out.println("En este programa vamos a mostrar los primeros 50 números impares: \n");
        
        for (int i = 1; i <= 50; i++) {
            
            System.out.print(numero + " ");
            numero += 2 ;
        }
    }
    
    // Ejercicio 9: par o impar.
    
    /**
     * Indica si un número introducido por teclado es par o impar.
     * @param num Número a comprobar si es par o impar.
     */
    
    public void esParImpar(int num)
    { 
            if (num %2 == 0 && num != 0) 
            {
                System.out.println("\nEl número es par.");
            }
            else if(num == 0)
            {
                System.out.println("El 0 no es un número válido.");
            }
            else 
            {
                System.out.println("\nEl número es impar.");
            }
    }
    

}
