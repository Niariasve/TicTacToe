/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Juego {
    private Tablero tablero;
    private int moves;
    
    private GameSimbol top_left;
    private GameSimbol center;
    private GameSimbol bottom_right;
    private GameSimbol bottom_left;   
    private GameSimbol top_right;
    private GameSimbol top_center; 
    private GameSimbol left_center;
    private GameSimbol bottom_center;
    private GameSimbol right_center;
    
    public Juego() {
        this.tablero = new Tablero();
        this.setCeldas();
        moves = 0;
    }
    
//    public static Juego getInstance() {
//        if (juego == null) {
//            Juego j = new Juego();
//            j.tablero = new Tablero();
//            j.setCeldas();
//            j.moves = 0;
//            juego = j;
//            return juego;
//        }
//        
//        return juego;
//    }
    
    //llamar cada vez que se realize un movimiento
    private void setCeldas() {
        top_left = tablero.getCelda(0, 0).getSimbol();
        center = tablero.getCelda(1,1).getSimbol();
        bottom_right = tablero.getCelda(2, 2).getSimbol();
        bottom_left = tablero.getCelda(2, 0).getSimbol();   
        top_right = tablero.getCelda(0, 2).getSimbol();
        top_center = tablero.getCelda(0, 1).getSimbol();
        left_center = tablero.getCelda(1, 0).getSimbol();
        bottom_center = tablero.getCelda(2, 1).getSimbol();
        right_center = tablero.getCelda(1, 2).getSimbol();
    }
    
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
        moves++;
    }
    
    public boolean hasMoves() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero.getCelda(i, j).isEmpty())
                    return true;
            }
        }
        return false;
    }
    
    public GameState hasWinner() {
        setCeldas();
        
        GameState diagonalWinner = checkDiagonalsForWinner();
        if (!(diagonalWinner == GameState.NO_WINNER)) {
            return diagonalWinner;
        }
        
        GameState horizontalWinner = checkHorizontalForWinner();
        if (!(horizontalWinner == GameState.NO_WINNER)) {
            return horizontalWinner;
        }
        
        GameState verticalWinner = checkVerticalForWinner();
        if (!(verticalWinner == GameState.NO_WINNER)) {
            return verticalWinner;
        }
        return GameState.NO_WINNER;
    }
    
    private GameState checkDiagonalsForWinner() {                       
        if (top_left == center && top_left == bottom_right) {
             return gameWinnerProcessor(top_left);
        }       
        if (bottom_left == center && bottom_left == top_right) {
            return gameWinnerProcessor(bottom_left);
        }       
        return GameState.NO_WINNER;
    }
    
    private GameState checkHorizontalForWinner() {
        if (top_left == top_center && top_left == top_right) {
            return gameWinnerProcessor(top_left);
        } 
        if (left_center == center && left_center == right_center) {
            return gameWinnerProcessor(left_center);
        }
        if (bottom_left == bottom_center && bottom_left == bottom_right) {
            return gameWinnerProcessor(bottom_left);
        }
        return GameState.NO_WINNER;
    }
    
    private GameState checkVerticalForWinner() {
        if (top_left == left_center && top_left == bottom_left) {
            return gameWinnerProcessor(top_left);
        } 
        if (top_center == center && top_center == bottom_center) {
            return gameWinnerProcessor(top_center);
        }
        if (top_right == right_center && top_right == bottom_right) {
            return gameWinnerProcessor(top_right);
        }
        return GameState.NO_WINNER;
    }
    
    private GameState gameWinnerProcessor(GameSimbol gameSimbol) {
        if (gameSimbol == GameSimbol.X)
            return GameState.WIN_X;
        return GameState.WIN_O;
    }
    
    public GameSimbol getTurn() {
        if ((moves % 2) == 0)
            return GameSimbol.X;
        return GameSimbol.O;
    }
}
