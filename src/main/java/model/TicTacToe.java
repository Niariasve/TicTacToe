/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class TicTacToe {
    GameSimbol[][] tablero;
    GameState gameState;
    
    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = GameSimbol.NONE;
            }
        }
        gameState = GameState.NO_WINNER;
    }
    
    public void resetTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = GameSimbol.NONE;
            }
        }
        gameState = GameState.NO_WINNER;
    }
    
    public boolean setSimbol(int i, int j, GameSimbol gameSimbol) {
        if (gameState == GameState.NO_WINNER) { 
            tablero[i][j] = gameSimbol;
            return true;
        }
        return false; //si llegamos aqui ya se acabo la partida
    }
    
    public GameState getGameState() {
        return gameState;
    }
     
    public static GameState getGameStateOfGameSimbol(GameSimbol gs) {
        if (gs == GameSimbol.X)
            return GameState.WIN_X;
        return GameState.WIN_O;
    } 
}
