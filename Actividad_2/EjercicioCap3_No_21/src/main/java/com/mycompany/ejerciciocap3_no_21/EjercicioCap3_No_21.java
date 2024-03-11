/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap3_no_21;


public class EjercicioCap3_No_21 {

    public static void main(String[] args) {
        //Definicion de las variables de la clase que contendra la informacion a usar:
        //Creamos el objeto correspondiente al triángulo el cual contendra los atributos del mismo y 
        // los metodos correspondientes
        Triangulo tr = new Triangulo();
        
        // Usamos el metodo ladosTriangulo el cual se encargara de leer en consola los datos 
        //de los lados del triangulo
        tr.ladosTriangulo();
       
        //Creamos tambien las variables que contendran los resultados del problema
        double per, sper, area;
        
        // En cada variable colocamos los metodos que hallan los parametros pedidos.
        
        per = tr.Perimetro();
        
        sper = tr.Semiperimetro();
        
        area = tr.Area();
       
        // Mostramos los resultados en consola
        
        System.out.println("El perimetro del triángulo es: " + per);
        System.out.println("El semiperimetro del triángulo es: " + sper);
        System.out.println("El area del triángulo es: " + area);
        
        
        
        
        
        
    }
}
