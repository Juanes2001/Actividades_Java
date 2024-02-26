/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciono_12;

/**
 *
 * @author juane
 */
public class EjercicioNo_12 {

    public static void main(String[] args) {
        // Se declaran las variables, el Salario bruto, el neto y la retencion
        // en fuente.
        double salB, salN, ret;
        
        //Se calcula el salario bruto como la rata de salario por hora multiplicado
        // el numero total de horas, el resultado es el salario en pesos 
        salB = 48*5000;
        
        // La retencion es un 12.5 por ciento del salario bruto, este se calcula
        // multiplicando el salario bruto por el porcentaje de retencion:
        
        ret = salB * 12.5/100;
        
        // El salario neto se calcula restando la retencion en la fuente al
        //salario bruto
        
        salN = salB -ret;
        
        // Se muestran los datos pedidos
        System.out.println(" El salario bruto del trabajador es : " + salB);
        System.out.println(" El salario neto del trabajador es : " + salN);
        System.out.println(" La retencion en la fuente es : " + ret);
    }
}
