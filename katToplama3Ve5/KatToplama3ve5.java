/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kattoplama3ve5;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class KatToplama3ve5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Sayi giriniz: ");
        number = s.nextInt();
        int total = besVeUcKat(number);
        System.out.printf("%d sayisinin 3 ve 5 katlarının toplamı = %d",number, total);
    }
    
    public static int besVeUcKat(int num){
        int total = 0;
        while (num > 0) {            
            if (num % 3 == 0 || num % 5 == 0){
                total += num;
            }
            num--;
        }
        return total;
    }
    
    
    
}

