/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();
        
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        
        System.out.print("Introduce el anio: ");
        int año = sc.nextInt();
        
        boolean fechaValida = true;
        
        if (mes < 1 || mes > 12) {
            fechaValida = false;
        } else {
            if (mes == 2) {
                if (dia < 1 || dia > 28) {
                    fechaValida = false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 1 || dia > 30) {
                    fechaValida = false;
                }
            } else {
                if (dia < 1 || dia > 31) {
                    fechaValida = false;
                }
            }
        }
        
        if (fechaValida) {
            System.out.println("La fecha es valida.");
        } else {
            System.out.println("La fecha es invalida como el amor de tu ex");
        }
    }
}
