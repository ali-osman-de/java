/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradelevel;

/**
 *
 * @author Ali Osman
 */
public class GradeLevel {

    public static void main(String[] args) {
        char grade = 'A';
        
        switch(grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                  break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                  break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                 break;
            case 'D':
                System.out.println("Orta : Geçtiniz");
                  break;
            case 'F':
                System.out.println("Kötü : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girişi!");
        }
    }
}
