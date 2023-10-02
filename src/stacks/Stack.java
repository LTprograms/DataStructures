/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks;

import node.Node;

/**
 *
 * @author usuario
 */
public class Stack implements StackI {
    private int size;
    private Node last;
    public Stack() {
        size = 0;
        last = null;
    }

    @Override
    public void insert(int element) {
        Node n = new Node(element);
        n.setPrevious(last);
        last = n;
        size++;
    }

    @Override
    public int pop() {
        if (size!=0) {
            int num = last.getNumber();
            last = last.getPrevious();
            size--;
            return num;
        }
        return -1;
    }

    @Override
    public int peek() {
        return size==0 ? -1 : last.getNumber();
    }

    @Override
    public int lenght() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    
}
