/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap4_n7;

/**
 *
 * @author juane
 */
public class comparador {
    
    // Definimos los valores de entrada que se escriben en pantalla
    float A;
    float B;
    
    // seteamos el valor de cada parametro ingresado con la funcion setparameter
    public void setParameters(float a, float b){
        A= a;
        B= b;
    }
    
    // Creamos la funcion que compara los numeron ingresados y entrega un String 
    public String compare(){
        
        if (A<B){
            
            return "El numero " + (int)A +" es menor a " +(int) B; 
            
        }else if (A>B){
            
            return "El numero " + (int)A + " es mayor a " + (int)B;
            
        }else{
            
            return "El numero " + (int)A + " es igual a " + (int)B;
            
        }
        
    }
    
}
