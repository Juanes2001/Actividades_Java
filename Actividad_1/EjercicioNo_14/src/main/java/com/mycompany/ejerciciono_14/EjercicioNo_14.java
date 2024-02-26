/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciono_14;
import java.util.Scanner;

public class EjercicioNo_14 {

    public static void main(String[] args) {
        // Creacion de las variable a usar
        double x;
        
        // Se pregunta en consola cual es el numero a tratar
        Scanner entradaNum = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        x = entradaNum.nextDouble();
        
        // Se muestra en pantalla el cuadrado de ese numero
        System.out.println("El cuadrado del numero ingresado es: " + Math.pow(x, 2));
        //Se muestra en pantalla el cubo de el numero ingresado
        System.out.println("El cubo del numero ingresado es: " + Math.pow(x, 3));
    }
}
