/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w3schoolsq;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class W3schoolsq {

    public static void main(String[] args) {
        Hesapla hesapla = new Hesapla();
        CarpimTablosu carpimtablosu = new CarpimTablosu();
        AlanHesaplayici alanHesaplayici = new AlanHesaplayici();
        AvarageCalculate ortalamaHespalama = new AvarageCalculate();
        
        Scanner s = new Scanner(System.in);
        
        //1.Question
        System.out.println("Merhaba\nAlexandra Abramov");
        
        //2.Question
        
        int num1 = 74;
        int num2 = 36;
        int total = num1 + num2;
        System.out.println(total);
        //3.Question
        
        int divide = 50/3;
        System.out.println(divide);
        
        //4.Question
        
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+(-3)*5/8);
        System.out.println(5+15/3*2-8%3);
        
        //5-6.Question
        
        int num3, num4;
        
        System.out.print("Birinci sayiyi girin: ");
        num3 = s.nextInt();
        System.out.print("İkinci sayiyi girin: ");
        num4 = s.nextInt();
        System.out.println(hesapla.topla(num3, num4));
        System.out.println(hesapla.cıkar(num3, num4));
        System.out.println(hesapla.carp(num3, num4));
        System.out.println(hesapla.bolme(num3, num4));
        
        
        //7.Question
        
        int num5;
        
        System.out.println("Çarpım tablosu yazılacak sayiyi girin: ");
        num5 = s.nextInt();
        carpimtablosu.carpimTablosu(num5);
        
        
        //8.Question
        double yaricap = 7.5;
        System.out.println(alanHesaplayici.daireAlani(yaricap));
        System.out.println(alanHesaplayici.daireCevresi(yaricap));
        
        //9.Question
        
        double num6, num7,num8;
        System.out.println("Sayi girin: ");
        num6 = s.nextDouble();
        num7 = s.nextDouble();
        num8 = s.nextDouble();
        System.out.println(ortalamaHespalama.ortalamaHesaplayıcı(num6, num7, num8));
        
        
        double genislik = 5.5;
        double yükseklik = 8.5;
        
        System.out.println(alanHesaplayici.dikdortgenAlani(genislik, yükseklik));
        System.out.println(alanHesaplayici.dikdortgenCevresi(genislik, yükseklik));

        
        
        
    }
}
