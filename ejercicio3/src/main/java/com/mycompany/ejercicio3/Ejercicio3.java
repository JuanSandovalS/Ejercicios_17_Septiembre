/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("Orden: " + num1 + ", " + num2);
        } else {
            System.out.println("Orden: " + num2 + ", " + num1);
        }
    }
}
