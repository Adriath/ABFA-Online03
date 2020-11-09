/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 * Contiene métodos estáticos que permiten sumar, restar, multiplicar y 
 * dividir los valores x e y.
 *
 * @author Adrián Arjona
 * @version 1.0
 */


public class OperacionesMatematicas {
    
    // Declaración de variables
    
    private double x ;
    private double y ;
    
    // métodos
    
    /**
     * Configura el valor de la variable x.
     * @param x Valor de x.
     */
    public void configuraX(double x){
        this.x = x ;
    }
    
    /**
     * Configura el valor de la variable y.
     * @param y Valor de y.
     */
    public void configuraY(double y){
        this.y = y ;
    }
    
    /**
     * Suma los valores "x" e "y".
     * @param x Variable x.
     * @param y Variable y.
     * @return Resultado de la suma.
     */
    public static double suma(double x, double y)
    {
        double resultado = x + y;
        return resultado ;
    }
    
    /**
     * Resta los valores "x" e "y".
     * @param x Variable x.
     * @param y Variable y que restará a x.
     * @return Resultado de la resta.
     */
    public static double resta(double x, double y)
    {
        double resultado = x - y;
        return resultado ;
    }
    
    /**
     * Multiplica los valores "x" e "y".
     * @param x Variable x.
     * @param y Variable y.
     * @return Resultado de la multiplicación.
     */
    public static double multiplica(double x, double y)
    {
        double resultado = x * y;
        return resultado ;
    }
    
    /**
     * Divide los valores "x" e "y".
     * @param x Número a dividir.
     * @param y Número por el que se divide x.
     * @return Resultado de la división.
     */
    public static double divide(double x, double y)
    {
        double resultado = x / y;
        return resultado ;
    }
}
