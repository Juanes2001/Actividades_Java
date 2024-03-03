/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap4_no_22;

import java.util.Scanner;

public class EjercicioCap4_No_22 {

    public static void main(String[] args) {
        // Definimos las variables que se van a usar para resolver el problema
        String nombreEmpleado;
        float salBasicoph;
        float horasMensuales;
        float salarioMensual;
        
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
        
        //Hacemos la condicion que pide el ejercicio
        
        if (salarioMensual > 450000){
            
            System.out.println( nombreEmpleado);
            System.out.println("$" + salarioMensual);
            
        }else{
            
            System.out.println(nombreEmpleado);
                
        }
    
    
    }
}
