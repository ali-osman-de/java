/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arkadassayi;

/**
 *
 * @author Ali Osman
 */
public class ArkadasSayi {

    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;
        int total1 = 0;
        int total2 = 0;
        
        for (int i = 1; i < num1; i++) {
            if (num1%i==0) {
                total1 = total1 + i;
            }
        }
        
        for (int i = 1; i < num2; i++) {
            if (num2%i==0) {
                total2 = total2 + i;
            }
        }
        
        if(num1 == total2  && num2 == total1){
            System.out.println("Bu iki sayi arkadaştır!");
        }else{
            System.out.println("Bu iki sayi arkaş değildir!");
        }
        
        
        
    }
}
