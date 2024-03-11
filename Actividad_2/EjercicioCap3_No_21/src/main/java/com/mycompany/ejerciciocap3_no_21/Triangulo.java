/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap3_no_21;

import java.util.Scanner;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    public void ladosTriangulo(){
        //Preguntamos su valor en consola
        Scanner entrada = new Scanner (System.in);
        System.out.print("Primer lado del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("\n");
        
        System.out.print("Segundo lado del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("\n");
        
        System.out.print("Tercer lado del triangulo: ");
        lado3 = entrada.nextDouble();
        System.out.print("\n");
        
        
    }
    
    public double Perimetro (){
        double per;
        
        per = lado1 + lado2 + lado3;
        
        return per;
    }
    
    public double Semiperimetro (){
        double sper;
        
        sper = (lado1 + lado2 + lado3)/2;
        
        return sper;
    }
    
    public double Area (){
        double area;
        double y;
    
        y = Semiperimetro();
        
        area = Math.sqrt(y*(y-lado1) *(y-lado2)*(y-lado3) );
        
        return area;
    }
}
