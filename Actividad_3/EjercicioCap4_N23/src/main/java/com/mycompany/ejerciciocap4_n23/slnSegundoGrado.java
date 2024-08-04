/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap4_n23;

/**
 *
 * @author juane
 */
public class slnSegundoGrado {
    
    // Parametros dados para la ecuacion de segundo grado
    float A;
    float B;
    float C;
    
    //Definimos la funcion que define numericamente tales parametros
    public void setParameters(float a, float b, float c){
        A=a;
        B=b;
        C=c;
    }
    
    //Definimos una funcion que nos calcule las soluciones posibles para la ecuacion de segundo grado dada
    // de tipo ax^2 + bx + c = 0
    public String[] raices(){
        //definimos un Arrray de dos dimensiones donde se tendra String donde estaran las soluciones
        //del problema.
        String[] rs = new String[2];
        //Calculamos el discriminante para saber si tenemos soluciones reales o no
        float discriminante = (float) Math.pow(B, 2)-4 * A * C;
        
        if ((discriminante > 0) && (discriminante != 0)){
            
            rs[0] = (float) ( (-B + Math.sqrt(discriminante)) / (2 * A) )+ "";
            rs[1] = ""+ (float) ( (-B - Math.sqrt(discriminante)) / (2 * A) );
            return rs;
            
        }else if (discriminante == 0){
            
            rs[0] = "" + (-B ) / (2 * A);
            rs[1] = "" + (-B ) / (2 * A);
            return rs;
            
        }else{
            rs [0] = "" + (float) (-B / (2 * A) ) + " + " +  
                     (float)(Math.sqrt( -1 *discriminante) / (2 * A)) + "i" ;
            rs [1] = "" + (float) (-B / (2 * A) ) + " - " +  
                     (float)(Math.sqrt( -1 *discriminante) / (2 * A)) + "i" ;
            
            return rs;
        }
        
    }
}
