/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2_87_95;

/**
 *
 * @author juane
 */
public class circulo {
    
    //Se define el atributo correspondiende al radio del circulo
    float radio;
    
    //Creamos una funcion donde se setea el valor del radio cuando le demos entrada por el
    // panel frontal
    public void setParameter (float r){
        radio = r;
    }
    
    //Creamos un par de metodos que nos calculen por un lado el perimetro y por otro lado el area
    // del circulo
    public float calcPerimetro (){
        return (float) (2 * Math.PI * radio);
    }
    
    public float calcArea (){
        return (float) (Math.PI * Math.pow(radio, 2));
    }
    
}
