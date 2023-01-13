/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sayibulma;

/**
 *
 * @author Ali Osman
 */
public class SayiBulma {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int calling = 5;
        boolean thereIs = false;
        
        for (int number:numbers) {
            if(number ==calling){
                thereIs = true;
                break;
            }
        }
        
        if(thereIs){
            System.out.println("Sayi mevcuttur!");
        }else{
            System.out.println("Sayi mevcut değildir!");
        }
        
        
    }
}
