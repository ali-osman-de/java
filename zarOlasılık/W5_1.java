/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.w5_1;

import java.util.Random;

/**
 *
 * @author Student
 */
public class W5_1 {

    public static void main(String[] args) 
    {
            Random rnd = new Random();
            
            int temp,sayac;
            int [] sayi = new int[6];
            
            for (int i = 0; i < 6; i++) 
            {
                sayac = 0;    
                for (int j = 0; j < 1000; j++) {
                    temp = rnd.nextInt(1,7);                  
                    if (temp == i+1)
                    {
                        sayac++;
                    }
                        sayi[i] =sayac;
                    }                  
                }
          for (int i = 0; i <6; i++) {
            System.out.println((i+1) +" gelme olasılığı "+ sayi[i]);
        }      
        }
 }

