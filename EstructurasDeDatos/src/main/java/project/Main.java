/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author alexv
 */
public class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedList<Integer> list = new CircularDoubleLinkedList<>();
        for(int i = 0; i < 4; i++) {
            list.add(i, i);
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
