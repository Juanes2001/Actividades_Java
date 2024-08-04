/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioc4_n10;

/**
 *
 * @author juane
 */
public class pagoMatricula {
    
    // Se definen los parametros o atributos correspondientes a el usuario
    String numero_Inscripcion;
    String nombre;
    float patrimonio;
    int estrato;
    
    //Seteamos el vallor de los parametros ingresados en pantalla
    public void setParameters (String numIns, String nom, float patri, int est){
        
        numero_Inscripcion = numIns;
        nombre = nom;
        patrimonio = patri;
        estrato = est;
        
    }
    
    
    // Con  el siguiente metodo calculamos el valor de la matricula
    
    float matriculaCalc (){
        
        // cada estudiante paga fijo 50 mil, y se incrementa si se cumple que 
        // el patrimonio es mayor a 2 millones y es estrato superior a 3.
        if ((patrimonio > 2000000 ) && (estrato > 3)){
            float result = patrimonio * 3/100;
            return result + 50000;  
        }else{
            return 50000;
        }
        
    }
    
    
}
