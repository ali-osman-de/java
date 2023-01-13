/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject26;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class Mavenproject26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = s.nextInt();
        System.out.print(reverseNumber(number));
    }

    public static int reverseNumber(int n) {
        int s = 0;
        int remain = 0;
        do {
            remain = n % 10;
            s = s * 10 + remain;
            n = n / 10;
        } while (n > 0);
        return s;
    }
}
