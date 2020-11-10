/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.*;

/**
 * Este programa realiza operaciones a partir de las variables "x" e "y".
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion ;
        
        Scanner teclado = new Scanner(System.in);
        
        try
        {
        
            System.out.println("Bienvenido/a, a continuación vamos a operar a partir"
                    + " de los valores x e y.");

            System.out.print("\nPara empezar, introduce el valor de x, por favor: ");
            double x = teclado.nextDouble();

            System.out.print("Ahora introduce el valor de y: ");
            double y = teclado.nextDouble();

            System.out.println("Ahora que tenemos los valores selecciona qué quieres"
                    + " hacer con ellos.");
            System.out.println("1 --> Sumar."
                    + "\n2 --> Restar."
                    + "\n3 --> Multiplicar."
                    + "\n4 --> Dividir.");

            opcion = teclado.nextInt();

            switch (opcion)
            {
                case 1:

                    System.out.println("El resultado de la suma es : " + OperacionesMatematicas.suma(x, y));

                    break;

                case 2:

                    System.out.println("El resultado de la resta es: " + OperacionesMatematicas.resta(x, y));

                    break;

                case 3:

                    System.out.println("El resultado de la multiplicación es: " + OperacionesMatematicas.multiplica(x, y));

                    break;

                case 4:

                    System.out.println("El resultado de la división es: " + OperacionesMatematicas.divide(x, y));

                    break;
                    
                default:
                    
                    System.out.println("Opción no válida.");
                    
                    break;
            }
        }
        catch(ArithmeticException e){
            
            System.err.println("No se puede dividir entre 0.");
        }
        catch(InputMismatchException e){
            
            System.err.println("El valor introducido no es válido. Puede que "
                    + "hayas usado una letra.");
        }
        catch(Exception e){
            
            System.err.println("Algo ha ido mal. Valor no permitido.");
        }
        
        System.out.println("\n ------------ El programa ha finalizado. -------------");
        
    }
    
}
