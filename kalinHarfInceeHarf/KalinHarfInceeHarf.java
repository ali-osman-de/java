/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalinharfinceeharf;

/**
 *
 * @author Ali Osman
 */
public class KalinHarfInceeHarf {

    public static void main(String[] args) {
        String harf = "K";
        boolean kalin = false;
        boolean ince = false;
        
        String[] kalinUnluler = {"a","ı","o","u"};
        String[] inceUnluler = {"e","i","ö","ü"};
        
        for (String kalinHarfler : kalinUnluler) {
            if (kalinHarfler.equals(harf)) {
                kalin = true;
            } 
        }
        
         for (var inceHarfler : inceUnluler) {
            if (inceHarfler.equals(harf)) {
                ince = true;
            } 
        }
        
        if (kalin == true) {
                System.out.println("Kalin harf");
                
        }else if (ince == true){
                System.out.println("İnce harf");
         }else{
            System.out.println("Geçersiz harf girdiniz.");
        }
        
        
        
        
    }
}
