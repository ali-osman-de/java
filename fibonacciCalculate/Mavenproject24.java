/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject24;

/**
 *
 * @author Ali Osman
 */
public class Mavenproject24 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
