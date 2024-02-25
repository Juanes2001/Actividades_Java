/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciono_17;
import java.util.Scanner;

public class EjercicioNo_17 {

    public static void main(String[] args) {
        // Creacion de las variable a usar
        double x;
        
        // Se pregunta en consola cual es el radio del circulo
        Scanner entradaNum = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        x = entradaNum.nextDouble();
        
        // Se muestra en pantalla el area del circulo
        System.out.println("El area del circulo es : " + Math.PI*Math.pow(x, 2));
        //Se muestra en pantalla el perimetro del circulo
        System.out.println("El perimetro de la circunferencia es : " + 2*Math.PI*x);
    }
}
