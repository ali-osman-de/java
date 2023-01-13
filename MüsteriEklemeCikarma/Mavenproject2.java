/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        owner own = new owner();
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        String newCustomer;
        int tercih;

        while (true) {
            System.out.println("""
                           1-Müşteri ekleme
                           2-Müşteri silme
                           3-Güncel Müşteri Listesi
                           4-Çıkış
                           Terhiniz: 
                           """);
            tercih = s.nextInt();
            System.out.println("-------------------------------------------------------------");
            if (tercih == 1) {
                System.out.println("""
                                   Müşteri Eklemeyi Seçtiniz!
                                   Müşteri Adı Giriniz: 
                                   """);
                newCustomer = s.next();
                list.add(newCustomer);
                own.MusteriEklendi();
                System.out.println("-------------------------------------------------------------");

            } else if (tercih == 2) {
                System.out.println("""
                                   Müşteri Silmeyi Seçtiniz!
                                   Müşteri Adı Giriniz:
                                   """);
                newCustomer = s.next();
                list.remove(newCustomer);
                own.MusteriSilindi();
                System.out.println("-------------------------------------------------------------");
            } else if (tercih == 3) {
                for (String string : list) {
                    System.out.printf("Müşteri Listesi: %s\n", string);
                }
                System.out.println("-------------------------------------------------------------");
            } else if (tercih == 4) {
                break;
            } else {
                System.out.println("Beklenmedik bir hata oluştu!");
                System.out.println("-------------------------------------------------------------");
            }

        }

    }
}
