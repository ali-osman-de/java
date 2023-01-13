/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.premidtermquestion_3;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class PreMidtermQuestion_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int konum, x, y, yenisayi;

        System.out.println("The length of the array:");
        y = s.nextInt();
        int array[] = new int[y + 1];
        System.out.printf("Write %d numbers of the array: \n", y);
        for (x = 0; x < y; x++) {
            array[x] = s.nextInt();
        }
        System.out.print("Line in which the new number will be added:");
        konum = s.nextInt();
        System.out.println("The new number ");
        yenisayi = s.nextInt();
        for (x = y - 1; x >= konum - 1; x--) {
            array[x + 1] = array[x];
        }
        array[konum - 1] = yenisayi;
        System.out.println("The final number of the array");
        for (x = 0; x <= y; x++) {
            System.out.printf("%d \n", array[x]);
        }
    }
}