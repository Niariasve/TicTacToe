/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Celda {
    private GameSimbol simbol;
    
    public Celda() {
        simbol = GameSimbol.NONE;
    }
    
    public boolean isEmpty() {
        return this.simbol == GameSimbol.NONE;
    }
    
    public boolean isO() {
        return this.simbol == GameSimbol.O;
    }
    
    public boolean isX() {
        return this.simbol == GameSimbol.X;
    }
    
    public void clean() {
        simbol = GameSimbol.NONE;
    }
    
    public void setToX() {
        simbol = GameSimbol.X;
    }
    
    public void setToO() {
        simbol = GameSimbol.O;
    }
    
    public GameSimbol getSimbol() {
        return simbol;
    }
    
    public void setSimbol(GameSimbol simbol) {
        this.simbol = simbol;
    }
}
