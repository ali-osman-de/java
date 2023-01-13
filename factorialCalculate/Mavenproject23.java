/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject23;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class Mavenproject23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = s.nextInt();
        System.out.println(fact(number));
    }
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        else{
             return n * fact(n-1);
        }
    }
}
