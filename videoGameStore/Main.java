/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        VideoGame videoGame = new VideoGame();

        Integer choose, gamePrice, gameStock;
        String gameName, gameType;

        while (true) {
            System.out.println("""
                               Welcome On Our Video Game Store
                               What do you do ? 
                               1- Video Games
                               2- Add Video Game
                               3- Quit
                               """);
            choose = s.nextInt();

            if (choose == 3) {
                break;
            } else if (choose == 2) {

                System.out.print("Name of the game: ");
                gameName = s.next();
                videoGame.setGameName(gameName);

                System.out.print("Type of the game: ");
                gameType = s.next();
                videoGame.setGameType(gameType);

                System.out.print("Price of the game: ");
                gamePrice = s.nextInt();
                videoGame.setGamePrice(gamePrice);

                System.out.print("Stock of the game: ");
                gameStock = s.nextInt();
                videoGame.setGameStock(gameStock);

                System.out.print("---------------------------------");

            } else if (choose == 1) {

                System.out.println(
                        "---------------------------------------" + "\n"
                        + "Name of the Game Store: " + videoGame.getStoreName() + "\n"
                        + "Name of the game: " + videoGame.gameName + "\n"
                        + "Price of the game: " + videoGame.gamePrice + "$" + "\n"
                        + "Type of the game: " + videoGame.gameType + "\n"
                        + "Total game stock of shopping site: " + videoGame.gameStock + "\n"
                        + "-------------------------------------");

            }

        }

    }
}
