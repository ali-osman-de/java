/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3schoolsq;

/**
 *
 * @author Ali Osman
 */
public class AlanHesaplayici {
    
    double pi = 3.14;
    
    public double daireAlani(double r){
        return (double) (pi * (Math.pow(r,2)));
    }

    public double daireCevresi(double r){
        return (double) (2 * pi * r);
    }
    
    public double dikdortgenAlani(double genişlik, double yükseklik){
        return genişlik * yükseklik;
    }
    
    public double dikdortgenCevresi(double genişlik, double yükseklik){
        return (genişlik + yükseklik) * 2;
    }
    
}
