/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ctof;

/**
 *
 * @author Ali Osman
 */
public class weatherCalculate {
    double c;
    public int FtoC(int degree){
        c = (degree - 32) * (5/9);
                return (int) c;
    }
    
    double f;
    
    public int CtoF(int degree){
        f = (degree * 1.8) + 32;
        return (int) f;
    }

    
    
    
}
