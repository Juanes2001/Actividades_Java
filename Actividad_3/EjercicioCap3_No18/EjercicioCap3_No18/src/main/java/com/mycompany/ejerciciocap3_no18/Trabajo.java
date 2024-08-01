package com.mycompany.ejerciciocap3_no18;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
public class Trabajo {
    
    float numHoras;
    float valHoraTrabajada;
    float porcentRet;
    // Con esta funcion se define el valor de cada variable
    public void parametrosTrabajo (float numeroHoras, float valhoras, float porcentajeRetetención){
        numHoras = numeroHoras;
        valHoraTrabajada = valhoras;
        porcentRet = porcentajeRetetención;
    }
    
    //con esta funcion retornamos ya sea el salario bruto o el neto
    public float[] salB_salN (){
        
        float salBruto = numHoras * valHoraTrabajada * (1 - porcentRet / 100);
        float salNeto  = numHoras * valHoraTrabajada;
        
        float[] array  = new float[2];
        array[0] = salBruto;
        array[1] = salNeto;
        return array;
    }
    
    
    
}
