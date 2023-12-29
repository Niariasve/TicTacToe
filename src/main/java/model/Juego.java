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
    private static Juego juego;
    private Tablero tablero;
    private int moves;
    
    private Juego() {}
    
    public static Juego getInstance() {
        if (juego == null) {
            Juego j = new Juego();
            j.tablero = new Tablero();
            j.moves = 0;
            return j;
        }
        
        return juego;
    }
    
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    public boolean isFull() {
        //TODO
        throw new UnsupportedOperationException();
    }
    
    
    /**
     * Esta función devuelve un Booleano es decir puede devolver null
     * Si retorna true ha ganado X
     * Si retorna false ha ganado O
     * En caso de no haber ganador aún retorna Null
     * @return 
     */
    public GameState hasWinner() {
        Boolean turno = null;
        //check diagonales,
        //check horizontal
        //check vertical
        throw new UnsupportedOperationException();
    }
    
    public boolean getTurn() {
        if ((moves % 2) == 1)
            return true;
        return false;
    }
}
