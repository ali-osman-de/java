/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Sayi giriniz: ");
        num = s.nextInt();
        int result = factorial(num);
        System.out.printf("%d sayisinin faktöriyeli %d",num,result);
    }

    public static int factorial(int num) {
        int fact = 1;
        int i = 1;
        
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        
        return fact;
        
    }
    
    
}
