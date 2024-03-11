/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocap4_no_11;

import java.util.Scanner;

public class Numeros {
    int no_A;
    int no_B;
    int no_C;
    
    
    // Metodo para leer los numeros en consola
    public void leerNumeros (){
        
        //Preguntamos su valor en consola
        Scanner entrada = new Scanner (System.in);
        System.out.print("Primer numero: ");
        no_A = entrada.nextInt();
        System.out.print("\n");
        
        System.out.print("Segundo numero: ");
        no_B = entrada.nextInt();
        System.out.print("\n");
        
        System.out.print("Tercer numero: ");
        no_C = entrada.nextInt();
        System.out.print("\n");
        
    }
    
    //Metodo para  hallar el valor mayor
    
    public int numMayor(){
        //Mayor numero. La solucion para esto sera crear una estructura la cual
        //contenga a los numeros ingresados donde se pueda recorrer y aplicar
        //un algoritmo recursivo que logre encontrar el valor mas grande
        //Lo que se hace es preguntar con respecto al primer valor si tal valor
        // es mayor o igual que el resto de valores incluyendolo, por lo que queremos
        // que el mayor valor solo este en la primera posicion para luego agarrarlo
        // e imprimirlo en pantalla.
         int numeros[] = new int[3];
         numeros[0] = no_A;
         numeros[1] = no_B;
         numeros[2] = no_C;
         
         
         boolean flag = true;
         int counter = 0;
         int caja;
                 
         while (flag){
            for (int i= 0; i<=2 ;i++ ){
                 
                if (numeros[0]>=numeros[i]){
                    counter++;
                }else{
                    counter = 0;
                    caja= numeros[0];
                    numeros[0]= numeros[i];
                    numeros[i] = caja;
                    i=0;
                }
                if (counter == 3){
                    flag = false;
                }
            }
         }
         
         return numeros[0];
    }
    
    
    
}
