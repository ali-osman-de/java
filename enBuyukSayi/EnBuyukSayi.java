/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enbuyuksayi;

/**
 *
 * @author Ali Osman
 */
public class EnBuyukSayi {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 25;
        int num3 = 18;
        
        if (num1 > num2 && num1 > num3){
            System.out.println("Sayi1 diğerlerinden büyük!");
        }else if (num2 > num1 && num2 > num3){
            System.out.println("Sayi2 diğerlerinden büyük!");
        }else{
            System.out.println("Sayi3 diğerlerinden büyük!");
        }
    }
}
