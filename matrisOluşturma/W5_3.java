/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.w5_3;

/**
 *
 * @author yigit
 */
public class W5_3 {

    public static void main(String[] args) {
        
        int [][] matrisA = {{5,4,3},{3,2,3}};
        int [][] matrisB = {{2,1,9},{-3,-1,0}};
        int [][] matrisC = new int[2][3];
        
        System.out.println("A Matrisi\n");

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
           System.out.printf("%5d " ,matrisA[i][j]);
            }
            System.out.println();
             }
        System.out.println("B Matrisi\n");

            for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
          System.out.printf("%5d " ,matrisB[i][j]);
            }
            System.out.println();
             }
        System.out.println("C Matrisi\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrisC[i][j] = matrisA[i][j] + matrisB[i][j];
                System.out.printf("%5d " ,matrisC[i][j]);
            }
            System.out.println();
        }
        
        
    }
}
