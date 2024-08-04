package com.mycompany.ejerciciocap3_n19;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
public class Triangulo {
    
    // Definimos los atributos correspondientes a el dato de entrada
    float Lado;
    //Ahora definimos los atributos correspondientes a los datos de salida
    float perimetro;
    float altura;
    float Area;
    
    
    // definimos una funcion que setea los valor de entrada del lado
    public void setLado(float lado){
        Lado = lado;
    }
    
    // Creamos los metodos que nos calcularan a partir del lado los otros parametros 
    public float[] setParametros(){
        
        //Creamos un array de datos donde almacenaremos las respuestas
        float[] datos = new float[3];
        
        // Calculamos el perimetro del triangulo
        datos[0] = Lado * 3;
        // Calculamos la altura del triangulo 
        datos[1] = (float) Math.sin(Math.PI / 3) * Lado;
        // Calculamos el area del triangulo
        datos[2] = (float) datos[1] * Lado /2;
        
        return datos;
        
    }
    
    
    
    
    
}
