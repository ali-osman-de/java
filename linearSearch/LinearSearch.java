/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.linearsearch;

import java.util.Scanner;

/**
 *
 * @author Ali Osman
 */
public class LinearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int searchinNumber;
        int[] myList = {1, 3, 5, 7, 9, 11};
        System.out.print("Aradiğin sayiyi yaz: ");
        searchinNumber = s.nextInt();
        
        System.out.printf("Liste içerisinde %d sayisini aradiniz ve liste içerisinde %d sayisini buldunuz!",searchinNumber,sayiyiBul(searchinNumber, myList));

    }

    public static int sayiyiBul(int num, int myList[]) {

        int n = myList.length;

        for (int i = 0; i < n; i++) {
            if (myList[i] == num) {
                return num;
            }
        }
        return -1;
    
    }
    

}
