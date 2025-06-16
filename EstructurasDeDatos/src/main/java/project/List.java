/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project;

/**
 *
 * @author alexv
 */
public interface List<E> {
    boolean isEmpty();

    int size();

    boolean addFirst(E element);

    boolean addLast(E element);

    boolean add(E element, int index);

    E removeFirst();

    E removeLast();

    E remove(int index);

    E get(int index);
}
