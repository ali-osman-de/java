/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.premidtermquestion_2;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class PreMidtermQuestion_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number, x=0, y, temp;
        System.out.print("Enter the number:");
        number = s.nextInt(); 
        temp = number;
        for( ;number != 0; number /= 10 )
        {
            y = number % 10;
            x= x* 10 + y;
        }
        if (temp== x)
            System.out.println(temp + " is a palindrome number.");
        else
            System.out.println(temp + " is not a palindrome number.");
}
}
