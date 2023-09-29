/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lists;

/**
 *
 * @author usuario
 */
public class ArrayList implements List {
    private int[] array;
    int size;
    public ArrayList() {
        array = new int[0];
        size = 0;
    }    

    @Override
    public void insert(int element, int index) {
        if (index<0 || index>size) {
            System.out.println("Out of range");
            return;
        }
        int[] aux = new int[size+1];
        for (int i = 0; i < index; i++) {
            aux[i] = array[i];
        }
        aux[index] = element;
        for (int i = index; i < size; i++) {
            aux[i+1] = array[i];
        }
        array = aux;
        size++;
    }

    @Override
    public void append(int element) {
        int[] aux = new int[size+1];
        for(int i = 0; i < size; i++) {
            aux[i] = array[i];
        }
        aux[size] = element;
        size++;
        array = aux;
    }

    @Override
    public void prepend(int element) {
        int[] aux = new int[size+1];
        aux[0] = element;
        for (int i = 0; i < size; i++) {
            aux[i+1] = array[i];
        }    
        size++;
        array = aux;
    }

    @Override
    public void pop() {
        if (size!=0) {
            int[] aux = new int[size-1];
            for (int i = 0; i < size-1; i++) {
                aux[i] = array[i];
            }
            array = aux;
            size--;
        }
    }

    @Override
    public void remove(int element) {
        if (size==0) {
            return;
        }
        if (array[size-1] == element) {
            this.pop();
            return;
        }
        if (array[0]==element) {
            this.shift();
            return;
        }
        int index = -1;
        int aux[] = new int[size-1];
        for (int i = 0; i < size-1; i++) {
            if (array[i]==element) {
                index = i;
                break;
            }
            aux[i] = array[i];
        }
        if (index!=-1) {
            for (int i = index+1; i < size; i++) {
                aux[i-1] = array[i];
            }
            array = aux;
            size--;
        }
    }

    @Override
    public void delete(int index) {
        if (index>=0 && index<size) {
            int[] aux = new int[size-1];
            for (int i = 0; i < index; i++) {
                aux[i] = array[i];
            }
            for (int i = index+1; i < size; i++) {
                aux[i-1] = array[i];
            }
            array=aux;
            size--;
        }        
    }

    @Override
    public void shift() {
        if (size!=0) {
            int[] aux = new int[size-1];
            for (int i = 1; i < size; i++) {
                aux[i-1] = array[i];
            }
            array = aux;
            size--;
        }
        
    }

    @Override
    public boolean find(int element) {
        for (int i : array) {
            if (i==element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        if (index<0 || index>size-1) {
            System.out.println("Out of range");
            return -1;
        }
        return array[index];
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
        int aux;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (reverse) {
                    if (array[i]<array[j]) {
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                } else {
                    if (array[i]>array[j]) {
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        if (size==0) {
            return "[]";
        }        
        String txt = "[";
        for (int i = 0; i < size-1; i++) {
            txt += array[i] + " ";
        }
        txt += array[size-1] + "]";
        return txt;
    }

    @Override
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int head() {
        return size==0 ? -1 : array[0];
    }

    @Override
    public int tail() {
        return size==0 ? -1 : array[size-1];
    }    
}
