
import java.util.Scanner;
import lists.ArrayList;
import lists.LinkedList;

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
        LinkedList list = new LinkedList();
        
        System.out.println(list.toString());
        for (int i = 0; i < 5; i++) {
            list.append(i);
            System.out.println(list.toString());
        }
        list.insert(8, 3);
        System.out.println(list.toString());
        list.delete(6);
        System.out.println(list.toString());
    }
    
}
