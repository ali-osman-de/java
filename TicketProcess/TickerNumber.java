/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ucakkoltuknumarasi;

import java.util.Random;

/**
 *
 * @author Ali Osman
 */
public class TickerNumber {
    
    public int ticketNumber(){
        Random rnd = new Random();
        
        int tckNumber = rnd.nextInt(250000000,300000000);
        
        return tckNumber;
        
    }
    
}
