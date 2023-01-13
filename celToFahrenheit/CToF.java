/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ctof;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class CToF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        weatherCalculate weatherCalculate = new weatherCalculate();

        int tercihEdilme;
        int degree;

        System.out.print("""
                           Exit press 0
                           Welcome on board
                           1- F to C
                           2- C to F
                           Which do you prefer: """);

        tercihEdilme = s.nextInt();

        while (true) {
            if (tercihEdilme == 1) {
                System.out.print("Enter the F value = ");
                degree = s.nextInt();
                System.out.printf("%d F to C = %d\n", degree, weatherCalculate.FtoC(degree));
            } else if (tercihEdilme == 2) {
                System.out.print("Enter the C value = ");
                degree = s.nextInt();
                System.out.printf("%d C to F = %d\n", degree, weatherCalculate.CtoF(degree));
            }else if (tercihEdilme == 0) {
                break;
            }  else {
                System.out.println("Lütfen iki seçenekten birini seçiniz!");
            }
        
            
        }

    }
    
}
