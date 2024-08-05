/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte2_87_95;

/**
 *
 * @author juane
 */
public class triangulo {
    
     //Se define el atributo correspondiende a la base y la altura del triangulo
    float base;
    float altura;
    //Creamos una funcion donde se setea el valor de la base y la altura 
    //cuando les demos entrada por el panel frontal
    public void setParameter (float bas, float alt){
        base = bas;
        altura = alt;
    }
    
    //Creamos un par de metodos que nos calculen por un lado el perimetro 
    //y por otro lado el area del RECTANGULO    
    public float calcPerimetro (){
        return 3 * base;
    }
    
    public float calcArea (){
        return base * altura / 2;
    }
    
    
    //Creamos otros dos metodos donde se encuentra que tipo de triangulo es y la hipotenusa
   //Hipotenusa de un triangulo
    public double calcularHipotenusa(){
	return Math.pow(base*base + altura*altura, 0.5);
    }
    //Metodo para determinar si es un triangulo equilatero, escaleno o isosceles
    public String determinarTipoTriangulo(){
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa())){
            return "Equilatero";
            /* Todos sus
        lados son iguales */
  
        }
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())){
            return "Escaleno"; 
            /* Todos sus
        lados son diferentes */   
        }
        else{
            return "Isoceles";
         /* De otra
        manera, es isósceles */   
        }
    }

    
}
