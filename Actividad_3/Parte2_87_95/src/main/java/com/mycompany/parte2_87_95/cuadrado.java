/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2_87_95;

/**
 *
 * @author juane
 */
public class cuadrado {
    
     //Se define el atributo correspondiende al lado del cuadrado
    float lado;
    
    //Creamos una funcion donde se setea el valor del lado del cuadrado 
    //cuando les demos entrada por el panel frontal
    public void setParameter (float lad){
        lado = lad;
    }
    
    //Creamos un par de metodos que nos calculen por un lado el perimetro 
    //y por otro lado el area del cuadrado    
    public float calcPerimetro (){
        return 4 * lado ;
    }
    
    public float calcArea (){
        return lado * lado;
    }
    
    
    
}
