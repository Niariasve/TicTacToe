/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
class Celda {
    //null = vacio, true = x, false = o;
    Boolean estado;
    
    public Celda() {}
    
    public boolean isEmpty() {
        return this.estado == null;
    }
    
    public boolean isO() {
        return this.estado == false;
    }
    
    public boolean isX() {
        return this.estado == true;
    }
    
    public void clean() {
        estado = null;
    }
    
    public void setToX() {
        estado = true;
    }
    
    public void setToO() {
        estado = false;
    }
    
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean state) {
        estado = state;
    }
}
