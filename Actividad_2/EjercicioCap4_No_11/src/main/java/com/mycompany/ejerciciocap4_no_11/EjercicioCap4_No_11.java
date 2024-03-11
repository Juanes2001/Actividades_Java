/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocap4_no_11;

public class EjercicioCap4_No_11 {

    public static void main(String[] args) {
        
        // Importamos el objeto correspondiente a los numeros que se ingresaran
        Numeros num = new Numeros();
        
        //Leemos los numeros por consola
        num.leerNumeros();
        
        //Hallamos el valor mayor 
        int mayorNum;
        
        mayorNum = num.numMayor();
        
     
        // Mostramos los resultados en consola
        System.out.println("El valor mayor es: " +  mayorNum);
             
        
    }
}
