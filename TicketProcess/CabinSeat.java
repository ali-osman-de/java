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
public class CabinSeat {

    public String Seat() {
        String[] alpha = {"A", "B", "C", "D", "E", "F"};

        Random random = new Random();

        int AlphaNumber = random.nextInt(0, 6);
        int SeatNumber = random.nextInt(1, 29);
        
        return SeatNumber + alpha[AlphaNumber];
        
    }

}
