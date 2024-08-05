/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2_87_95;

/**
 *
 * @author juane
 */
public class rectangulo {
    
    //Se define el atributo correspondiende a la base y la altura del rectangulo
    float base;
    float altura;
    
    //Creamos una funcion donde se setea el valor de la base y la altura 
    //cuando les demos entrada por el panel frontal
    public void setParameter (float bas, float alt ){
        base = bas;
        altura = alt;
    }
    
    //Creamos un par de metodos que nos calculen por un lado el perimetro 
    //y por otro lado el area del RECTANGULO    
    public float calcPerimetro (){
        return 2 * base + 2 * altura ;
    }
    
    public float calcArea (){
        return base * altura;
    }
    
}
