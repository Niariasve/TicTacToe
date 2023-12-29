/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import arboles.Tree;

/**
 *
 * @author User
 */
public class Computer {
    
    private Tree<Tablero> brain;
    private boolean turno;
    
    public Computer(Tablero tablero, boolean turno) {
        this.brain = new Tree<>(tablero);
        this.turno = turno;
    }
    
    public void setTablero(Tablero tablero) {
        this.brain = new Tree<>(tablero);
        //llamar a la funcion que calcula todos los escenarios posibles 
    }
}
