/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejericiciono_4;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class EjericicioNo_4 {

    public static void main(String[] args) {
           //Declaracion de las variables que guardaran
        // los datos de las edades de cada persona
        double EdJuan, EdAna, EdAlberto, EdMadre;
        
        //Entramos en consola la edad de Juan y se almacena
        // en la variable EdJuan
        Scanner entradaJuan = new Scanner (System.in);
        System.out.println ("Edad de Juan:");
        EdJuan = entradaJuan.nextDouble();
        
        //Se calcula a partir de la edad de Juan las edades 
        // de cada uno de los hermanos y la madre de Juan
        EdAlberto = EdJuan * 2/3;
        EdAna = EdJuan *4/3;
        EdMadre = EdJuan + EdAlberto +EdAna;
        
        //Se imprime en consola
        System.out.println ("La edad de cada uno es:");
        System.out.println ("Madre:" +EdMadre +" años");
        System.out.println ("Juan:" + EdJuan +" años");
        System.out.println ("Ana:" + EdAna +" años");
        System.out.println ("Alberto:" + EdAlberto +" años");
        
        
        
        
        
    }
}

