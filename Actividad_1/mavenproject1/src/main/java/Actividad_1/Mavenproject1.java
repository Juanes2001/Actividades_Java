/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Actividad_1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        //Declaracion de las variables que guardaran
        // los datos de las edades de cada persona
        double EdJuan, EdAna, EdAlberto, EdMadre;
        
        //Entramos en consola la edad de Juan y se almacena
        // en la variable EdJuan
        Scanner entradaJuan = new Scanner (System.in);
        EdJuan = entradaJuan.nextDouble();
        
        //Se calcula a partir de la edad de Juan las edades 
        // de cada uno de los hermanos y la madre de Juan
        EdAlberto = EdJuan * 2/3;
        EdAna = EdJuan *4/3;
        EdMadre = EdJuan + EdAlberto +EdAna;
        
        //Se imprime en consola
        System.out.println ("La edad de cada uno es:");
        System.out.println ("Madre:" +EdMadre);
        System.out.println ("Juan:" + EdJuan);
        System.out.println ("Ana:" + EdAna);
        System.out.println ("Alberto:" + EdAlberto);
        
        
        
        
        
    }
}