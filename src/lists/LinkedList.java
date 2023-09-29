/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists;

import node.Node;

/**
 *
 * @author usuario
 */
public class LinkedList implements List {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        first = last = null;
        size = 0;
    }
    
    @Override
    public void insert(int element, int index) {
        if (index<0 || index>size) {
            return;
        }
        if (index==0) {
            this.prepend(element);
            return;
        }
        if (index==size-1) {
            this.append(element);
            return;
        }
        Node n = new Node(element);
        if (size==0) {
            first = last = n;            
        } else {            
            int i = 0;
            Node aux = first;
            while (i+1<index && aux.getNext()!=null) {
                aux = aux.getNext();
                i++;
            }    
            n.setNext(aux.getNext());
            aux.setNext(n);            
        }
        size++;
    }

    @Override
    public void append(int element) {
        Node n = new Node(element);
        if (size==0) {
            first = last = n;
        } else {
            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public void prepend(int element) {
        Node n = new Node(element);
        if (size==0) {
            first = last = n;
        } else {
            n.setNext(first);
            first = n;
        }
        size++;
    }

    @Override
    public void pop() {
        if (size!=0) {
            if (first==last) {
                first = last = null;
            } else{
                Node aux = first;
                while (aux.getNext().getNext()!=null) {
                    aux = aux.getNext();
                }
                aux.setNext(null);
            }
            size--;
        }
    }

    @Override
    public void remove(int element) {
        if (size!=0) {
            if (first.getNumber() == element) {
                shift();
                return;
            }
            if (last.getNumber() == element) {
                pop();
                return;
            }
            Node aux = first;
            while (aux.getNext() != null && aux.getNext().getNumber() != element) {
                aux = aux.getNext();
            }
            if (aux.getNext()!=null) {
                aux.setNext(aux.getNext().getNext());
                size--;
            }
        }
    }

    @Override
    public void delete(int index) {
        if (index<0 || index>size-1) {
            return;
        }
        if (size!=0) {
            if (index == 0) {
                shift();
                return;
            }
            if (index == size-1) {
                pop();
                return;
            }
            Node aux = first;
            int i = 0;
            while (aux.getNext() != null && i+1<index) {
                aux = aux.getNext();
                i++;
            }
            if (aux.getNext()!=null) {
                aux.setNext(aux.getNext().getNext());
                size--;
            }
        }
    }

    @Override
    public void shift() {
        if (size!=0) {
            if (first == last) {
                first = last = null;
            } else {
                first = first.getNext();
            }
            size--;
        }
    }

    @Override
    public boolean find(int element) {
        if (size==0) {
            return false;
        }
        if (first.getNumber()==element || last.getNumber()==element) {
            return true;
        }
        Node aux = first;
        while (aux.getNext()!=null) {
            if (aux.getNumber()==element) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public int get(int index) {
        if (index<0 || index>size-1) {
            System.out.println("Out of range");
            return -1;            
        } else {
            if (index==0) {
                return first.getNumber();
            }
            if (index==size-1) {
                return last.getNumber();
            }
            Node aux = first;
            int i = 0;
            while (aux.getNext()!=null && i<=index) {
                if (i==index) {
                    return aux.getNumber();
                }
                aux = aux.getNext();
                i++;
            }
            return -1;
        }        
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int lenght() {
        return size;
    }

    @Override
    public void sort(boolean reverse) {
        
    }

    @Override
    public String toString() {
        if (first==null) {
            return "[]";
        }
        String txt = "[";
        Node aux = first;
        while (aux.getNext()!=null) {
            txt += aux.getNumber() + " ";
            aux = aux.getNext();
        }
        txt += aux.getNumber() + "]";
        return txt;
    }

    @Override
    public int indexOf(int element) {
        if (size==0) {
            return -1;
        } else {
            if (first.getNumber() == element) {
                return 0;
            }
            if (last.getNumber() == element) {
                return size - 1;
            }
            Node aux = first;   
            int i = 0;
            while (aux!=null) {
                if (aux.getNumber() == element) {
                    return i;
                }
                aux = aux.getNext();
                i++;
            }
            return -1;
        }
    }

    @Override
    public int head() {
        return first==null ? -1 : first.getNumber();
    }

    @Override
    public int tail() {
        return last==null ? -1 : last.getNumber();
    }
    
}
