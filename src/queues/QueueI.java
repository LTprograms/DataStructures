/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package queues;

/**
 *
 * @author usuario
 */
public interface QueueI {
    public void insert(int element);
    public int get();
    public int peek();
    public int length();
    public boolean isEmpty();
}
