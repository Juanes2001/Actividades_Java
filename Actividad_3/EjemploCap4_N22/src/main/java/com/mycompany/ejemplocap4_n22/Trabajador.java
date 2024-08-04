/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplocap4_n22;

/**
 *
 * @author juane
 */
public class Trabajador {
    
    // Definimos las variables que se van a usar para resolver el problema
    String nombreEmpleado;
    float salBasicoph;
    float horasMensuales;
    float salarioMensual;
    
    public void defTrabajdor(String nomEm, float salB, float horasMen){
        
        //Definimos las variables
        //Que se leeran en pantalla
        nombreEmpleado = nomEm;
        salBasicoph = salB;
        horasMensuales = horasMen;
        // calculamos el salario mensual del empleado
        salarioMensual = horasMensuales * salBasicoph;
        
    }
    
    public String condTrabajador (){
        
        // calculamos el salario mensual del empleado
        
         //Hacemos la condicion que pide el ejercicio
        if (salarioMensual > 450000){
            return "El empleado se llama " + nombreEmpleado + " y su salario"
                    + " mensual es " + (int) salarioMensual;
            
        }else{
            
            return "El empleado se llama " + nombreEmpleado;
                
        }
        
    }
    
}
