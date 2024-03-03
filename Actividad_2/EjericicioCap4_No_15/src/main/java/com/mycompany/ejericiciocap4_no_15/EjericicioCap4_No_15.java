/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejericiciocap4_no_15;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class EjericicioCap4_No_15 {

    public static void main(String[] args) {
        //Definicion de las variables a usar
        int esf_A , esf_B, esf_C, esf_D;
        
        //Preguntamos su valor en consola
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el peso de las 4 esferas: ");
        esf_A = entrada.nextInt();
        esf_B = entrada.nextInt();
        esf_C = entrada.nextInt();
        esf_D = entrada.nextInt();
        
        //Diferente numero. La solucion para esto sera crear una estructura la cual
        //contenga a los numeros ingresados donde se pueda recorrer y aplicar
        //un algoritmo recursivo que logre encontrar el valor diferente
        //Lo que se hace es preguntar con respecto al primer valor si tal valor
        // es diferente que el resto de valores , por lo que queremos
        // la posicion en el arreglo del valor diferente
        // e imprimirlo en pantalla.
        int numeros[] = new int[4];
        numeros[0] = esf_A;
        numeros[1] = esf_B;
        numeros[2] = esf_C;
        numeros[3] = esf_D;

        String letras[] = new String[4];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        
        
        int counter = 0;
                 
         
        for (int i = 1; i <= 3 ;i++ ){

            if (numeros[0] == numeros[i]){
                
            }else{ 
                if (i==1){
                    if (numeros[0] == numeros [i+1]){
                        counter = 1;
                        break;
                    }else{
                        counter = 0;
                        break;
                    }
                }else{
                    counter = i;
                    break;
                }
                    
            }
        }
        
        //Ahora preguntamos si es mayor o menor
        
        String msj ;
        
        switch (counter){
            case 0 -> { 
                if(numeros[counter] > numeros[counter+1]){
                    msj = "mayor";
                }else{
                    msj = "menor";
                }
            }
            case 3 -> {
                if(numeros[counter] > numeros[counter-1]){
                    msj = "mayor";
                }else{
                    msj = "menor";
                }
            }
            default -> {
                if(numeros[counter] > numeros[counter+1]){
                    msj = "mayor";
                }else{
                    msj = "menor";
                }
            }
                
        }
        
        
        // Mostramos el resultado en consola
        System.out.println("El peso de la esfera " + letras[counter] + " es diferente y " + msj);
             
        
    }
}
