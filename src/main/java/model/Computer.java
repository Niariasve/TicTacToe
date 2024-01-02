/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import arboles.Tree;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author User
 */
public class Computer {
    
    private Tree<Tablero> brain;
    private Tablero tableroActual;
    private GameSimbol turn;
    
    public Computer(Tablero tablero, GameSimbol turn) {
        this.tableroActual = tablero;
        this.brain = new Tree<>();
        this.turn = turn;
    }
    
    public void setTablero(Tablero tablero) {
        this.brain = new Tree<>(tablero);
        //llamar a la funcion que calcula todos los escenarios posibles 
    }
    
    public static Tree<Tablero> generateAllScenarios(Tablero tablero, GameSimbol actual) {
        Tree<Tablero> tree = new Tree<>(tablero);
        Juego juego = new Juego();
        GameSimbol actualGS;
        
        if ((tablero.ocuppied() % 2) == 0) {
            actualGS = GameSimbol.X;
        } else {
            actualGS = GameSimbol.O;
        }
               
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tablero t = Computer.copyTablero(tablero);
                if (t.getCelda(i, j).isEmpty()) {
                    t.setSimbol(i, j, actualGS);
                    tree.setChild(generateAllScenarios(t, actual));
                }              
            }
        }
        
        return tree;
    }
    
    public static int winnerCount(Tree<Tablero> tree) {
        return 0;
    }
    
    private static Tablero copyTablero(Tablero tablero) {
        Tablero t = new Tablero();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t.setSimbol(i, j, tablero.getCelda(i, j).getSimbol());
            }
        }
        return t;
    }
    
    private int calculateBestMove() {
        //todo
        List<Tree<Tablero>> jugadas = brain.getChildren();
        return 0;
    }
    
    private GameSimbol getContratyGameSimbol(GameSimbol gameSimbol) {
        if (gameSimbol == GameSimbol.X)
            return GameSimbol.O;
        return GameSimbol.X;
    }
    
    private static GameState getGameStateOfGameSimbol(GameSimbol gameSimbol) {
        if (gameSimbol == GameSimbol.X) {
            return (GameState.WIN_X);
        }
        return GameState.WIN_O;
    }
}
