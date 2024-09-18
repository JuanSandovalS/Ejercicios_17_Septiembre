/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio2 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("El numero es positivo.");
        } else if (num < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}
