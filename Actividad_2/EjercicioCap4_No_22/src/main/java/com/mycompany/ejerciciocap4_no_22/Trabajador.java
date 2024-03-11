/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap4_no_22;

import java.util.Scanner;

public class Trabajador {
    
    // Definimos las variables que se van a usar para resolver el problema
    String nombreEmpleado;
    float salBasicoph;
    float horasMensuales;
    float salarioMensual;
    
    public void defTrabajdor(){
        
        //Entramos por consola los datos pedidos
        Scanner entrada = new Scanner (System.in);
        
        System.out.print ("Ingrese el nombre del trabajador: ");
        nombreEmpleado = entrada.next();
        System.out.println("");
        
        System.out.print ("Ingrese el valor pagado por hora: ");
        salBasicoph = entrada.nextFloat();
        System.out.println("");
        
        System.out.print ("Ingrese la cantidad de horas trabajadas: ");
        horasMensuales = entrada.nextFloat();
        System.out.println("");
        
         //calculamos el salario mensual del trabajador
        salarioMensual = salBasicoph * horasMensuales;
        
    }
    
    public void condTrabajador (){
        
         //Hacemos la condicion que pide el ejercicio
        
        if (salarioMensual > 450000){
            
            System.out.println( nombreEmpleado);
            System.out.println("$" + salarioMensual);
            
        }else{
            
            System.out.println(nombreEmpleado);
                
        }
        
    }
    
}
