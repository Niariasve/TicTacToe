
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import model.*;

/**
 *
 * @author User
 */
public class TestDemo {
    public static void main(String[] args) {
        Juego j = Juego.getInstance();
        Tablero t = new Tablero();
        t.setSimbol(0,0,GameSimbol.O);
        t.setSimbol(1,1,GameSimbol.O);
        t.setSimbol(2,2,GameSimbol.X);
        j.setTablero(t);
        System.out.println(j.hasWinner());
    }
}
