/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author apple
 */
public class VideoGame extends ShoppingSite {

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @param gameName the gameName to set
     */
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * @return the GameType
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * @param GameType the GameType to set
     */
    public void setGameType(String GameType) {
        this.gameType = GameType;
    }

    /**
     * @return the gamePrice
     */
    public Integer getGamePrice() {
        return gamePrice;
    }

    /**
     * @param gamePrice the gamePrice to set
     */
    public void setGamePrice(Integer gamePrice) {
        this.gamePrice = gamePrice;
    }

    /**
     * @return the gameStock
     */
    public Integer getGameStock() {
        return gameStock;
    }

    /**
     * @param gameStock the gameStock to set
     */
    public void setGameStock(Integer gameStock) {
        this.gameStock = gameStock;
    }

    private enum GameTypeList {
        ACTION,
        ADVENTURE,
        STRATEGY,
        SPORTS,
        SIMULATION,
        RPG,
        PUZZLE
    }

    String gameName = "The Last of Us 1";
    int gamePrice = 100;
    int gameStock = 150;
    String gameType = "ADVENTURE";

}
