/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Tree<E> {
    TreeNode<E> root;
    
    public Tree(E contenido) {
        this.root = new TreeNode<>(contenido);
    }
    
    public Tree() {}
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public boolean isLeaf() {
        return root.children.isEmpty();
    }
    
    public E getRoot() {
        return root.contenido;
    }
    
    public void setRoot(E e) {
        root.contenido = e;
    }
    
    public List<Tree> getChildren() {
        return root.children;
    }
    
    public void setChild(Tree child) {
        root.children.add(child);
    }
    
    public List<E> recorrer() {
        List<E> result = new LinkedList<>();
        if (isEmpty()) return result;
        
        Deque<Tree<E>> cola = new ArrayDeque<>(); 
        cola.offer(this);
        while(!cola.isEmpty()) {
            Tree<E> tree = cola.poll();
            result.add(tree.root.contenido);
            for (Tree t : tree.getChildren()) {
                cola.offer(t);
            }
        }
        return result;
    }
    
    private class TreeNode<E> {
        E contenido;
        List<Tree> children;
        
        TreeNode(E contenido) {
            this.contenido = contenido;
            children = new LinkedList<>();
        }       
    } 
}
