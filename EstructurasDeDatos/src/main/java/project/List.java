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
    public boolean isEmpty();
    public int size();
    public boolean addFirst(E element);
    public boolean addLast(E element);
    public boolean add(E element, int index);
    public E removeFirst();
    public E removeLast();
    public E remove(int index);
    public E get(int index);
}
