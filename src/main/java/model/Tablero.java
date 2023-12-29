/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Tablero {
    private Celda[][] grid;
    
    public Tablero() {
        grid = new Celda[3][3];
    }
    
    public boolean isEmpty() {
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (!grid[i][j].isEmpty())
                    return false;
            }
        }
        return true;
    }
    
    public void setSimbol(int i, int j, GameSimbol simbol) {
        grid[i][j].setSimbol(simbol);
    }
    
    public Celda[][] getGrid() {
        return grid;
    }
    
    public Celda getCelda(int i, int j) {
        return grid[i][j];
    }
}
