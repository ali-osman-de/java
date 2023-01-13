/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mukemmelsayi;

/**
 *
 * @author Ali Osman
 */
public class MukemmelSayi {

    public static void main(String[] args) {
        int num = 6;
        int numberTotal = 0;
        
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                numberTotal+= i;
            }
        }
        
        if (num == numberTotal) {
            System.out.printf("%d Sayisi mükemmel sayi kategorisinde!", num);
        }else{
            System.out.printf("%d Sayisi mükemmel sayi kategorisinde değil!", num);
        }
        
    }
}
