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
        list.addFirst(0);
        list.addFirst(5);
        list.addLast(3);
        System.out.println(list);
        list.add(9, 2);
        list.add(99, 5);
        System.out.println(list);
    }
}
