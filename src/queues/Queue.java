/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queues;

import node.Node;

/**
 *
 * @author usuario
 */
public class Queue implements QueueI{
    private Node first;
    private Node last;
    private int size;
    
    public Queue() {
        first = last = null;
        size = 0;
    }
    
    @Override
    public void insert(int element) {
        Node n = new Node(element);
        if (first == null) {
            first = last = n;
        } else {
            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public int get() {
        if (first!=null) {
            int x = first.getNumber();
            first = first.getNext();
            size--;
            return x;            
        }
        return -1;
    }

    @Override
    public int peek() {
        return first.getNumber();
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
    
}
