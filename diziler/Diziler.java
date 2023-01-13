/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diziler;

/**
 *
 * @author Ali Osman
 */
public class Diziler {

    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Ahmet";
        String ogrenci3 = "Emir";
        String ogrenci4 = "Polat";

        
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------------------------------------");
        
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Emir";
        ogrenciler[3] = "Polat";
        
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        
        System.out.println("---------------------------------------------------------------");
       
        double[] myList = {1.2, 1.3, 1.5, 1.7};
        double total = 0;
        
        for (double number:myList) {
            total += number;
        }
        System.out.println(total);
        
        System.out.println("------------------------------------------------------------------");
        
        String[][] sehirler = new String[3][3];
        
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Kayseri";
        sehirler[0][2] = "Tekirdağ";
        sehirler[1][0] = "Sivas";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Çanakkale";
        sehirler[2][0] = "Nevşehir";
        sehirler[2][1] = "Niğde";
        sehirler[2][2] = "Muğla";

        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
        
        
        
        
         }
}
