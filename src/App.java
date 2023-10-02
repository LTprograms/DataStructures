
import java.util.Scanner;
import lists.ArrayList;
import lists.DoubleLinkedList;
import lists.LinkedList;
import queues.Queue;
import stacks.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            list.prepend(i);
        }
        System.out.println(list.toString());
    }
    
}
