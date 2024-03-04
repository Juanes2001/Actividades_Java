/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap3_no_21;

import java.util.Scanner;

public class EjercicioCap3_No_21 {

    public static void main(String[] args) {
        //Definicion de las variables a usar
        //Lados del triangulo
        double  ladoTriag1 , ladoTriag2, ladoTriag3;
        
        //Creamos tambien las variables que contendran los resultados del problema
        double per, sper, area;
        
        //Preguntamos su valor en consola
        Scanner entrada = new Scanner (System.in);
        System.out.print("Primer lado del triangulo: ");
        ladoTriag1 = entrada.nextDouble();
        System.out.print("\n");
        
        System.out.print("Segundo lado del triangulo: ");
        ladoTriag2 = entrada.nextDouble();
        System.out.print("\n");
        
        System.out.print("Tercer lado del triangulo: ");
        ladoTriag3 = entrada.nextDouble();
        System.out.print("\n");
        
        
        //Hallamos el perimetro, el semiperimetro y el area con el valor que se
        //entrego de los lados del triangulo
        per = ladoTriag1 + ladoTriag2 + ladoTriag3;
        sper = (ladoTriag1 + ladoTriag2 + ladoTriag3)/2;
        area = Math.sqrt(sper*(sper-ladoTriag1) *(sper-ladoTriag2)*(sper-ladoTriag3) );
        
        // Mostramos los resultados en consola
        
        System.out.println("El perimetro del triángulo es: " + per);
        System.out.println("El semiperimetro del triángulo es: " + sper);
        System.out.println("El area del triángulo es: " + area);
        
        
        
        
        
        
    }
}
