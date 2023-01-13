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
public class PNR {

    public String pnr() {

        Random rnd = new Random();

        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int rndAlpha = 0;
        int rndNumber = 0;
        String ikili;
        String fullyReservation = "";
        int ct = 4;

        for (int i = 0; i < ct; i++) {
            rndAlpha = rnd.nextInt(0, 26);
            rndNumber = rnd.nextInt(1, 10);
            ikili = alpha[rndAlpha] + rndNumber;
            fullyReservation += ikili;
        }

        return fullyReservation;

    }

}
