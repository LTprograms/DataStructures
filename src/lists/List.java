/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lists;

/**
 *
 * @author usuario
 */
public interface List {
    // insert
    public void insert(int element, int index);
    public void append(int element);
    public void prepend(int element);
    //delete
    public void pop();
    public void remove(int element);
    public void delete(int index);
    public void shift();
    //consult
    public boolean find(int element);
    public int get(int index);
    public boolean isEmpty();
    public int lenght();
    public int indexOf(int element);
    public int head();
    public int tail();
    //operations
    public void sort(boolean reverse);    
}
