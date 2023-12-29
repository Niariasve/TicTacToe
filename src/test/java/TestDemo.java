
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
        Celda c = new Celda();
        c.setEstado(GameSimbol.O);
        System.out.println(c.getEstado());
        System.out.println(c.getEstado().equals("NONE"));
    }
}
