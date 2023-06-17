/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
/**
 *
 * @author alexv
 */
public class CircularDoubleLinkedList<E> implements List<E> {
    private CDLLNode<E> last;
    
    public CircularDoubleLinkedList() {
        last = null;
    }
    
    private CDLLNode<E> getNode(int index) {
        CDLLNode<E> traveller = last.getNext();
        for(int i = 0; i < index; i++) {
            traveller = traveller.getNext();
        }
        return traveller;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public int size() {
        if(isEmpty()) {
            return 0;
        }
        CDLLNode traveller;
        int cont = 0;
        for(traveller = last; traveller != last.getPrev(); traveller = traveller.getNext()) {
            cont++;
        }
        return cont + 1;
    }

    @Override
    public boolean addFirst(E element) {
        if(element == null) {
            return false;
        }
        CDLLNode node = new CDLLNode(element);
        if(isEmpty()) {
            last = node;
            last.setNext(node);
            last.setPrev(node);
        }else {
            node.setPrev(last);
            node.setNext(last.getNext());
            
            last.getNext().setPrev(node);
            last.setNext(node);   
        }
        return true;
    }

    @Override
    public boolean addLast(E element) {
        if(element == null) {
            return false;
        }
        CDLLNode node = new CDLLNode(element);
        if(isEmpty()) {
            addFirst(element);
        }else {
            node.setNext(last.getNext());
            node.setPrev(last);
            
            last.getNext().setPrev(node);
            last.setNext(node);
            
            last = node;
        }
        return true;
    }

    @Override
    public boolean add(E element, int index) {
        if(element == null || index < 0 || index > this.size()) {
            return false;
        }
        if(isEmpty()) {
            addFirst(element);
        }else if(index == size()) {
            addLast(element);
        }else {
            CDLLNode newNode = new CDLLNode(element);
            CDLLNode reference = getNode(index);

            newNode.setNext(reference);
            newNode.setPrev(reference.getPrev());

            reference.getPrev().setNext(newNode);
            reference.setPrev(newNode);
        }
        return true;
    }

    @Override
    public E removeFirst() {
         CDLLNode<E> first = getHeader();
        if(!(isEmpty())){
            E content = first.getContent();
            if(size() == 1){
                last = null;
            }else if(size() == 2){
                last.setNext(last);
                last.setPrev(last);

            }else{
                first.getNext().setPrev(last);
                last.setNext(first.getNext());
            }
            return content;
        }
        return null;
    }

    @Override
    public E removeLast() {
        
        if(!(isEmpty())){
            CDLLNode<E> first = getHeader();
            E content = last.getContent();
            if(size() == 1){
                last = null;

            }else if(size() ==2){
                first.setNext(last.getNext());
                first.setPrev(last.getPrev());
                last = first;
            }else{
                last.getPrev().setNext(last.getNext());
                last = last.getPrev();
                first.setPrev(last);
            }
            return content;
        }
        return null;
    }

    @Override
    public E remove(int index)  {
        if(index <0 || index>= size() || isEmpty()){
            return null;
        }else {
            if( index == 0){
                return removeFirst();
            }else if(index== size()-1){
                return removeLast();
            }else{
                CDLLNode<E> nodoBase = getNode(index);
                nodoBase.getPrev().setNext(nodoBase.getNext());
                nodoBase.getNext().setPrev(nodoBase.getPrev());
                return nodoBase.getContent();
            }
        }            
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override 
    public String toString() {
        if(isEmpty()) {
            return "[]";
        }
        String result = "[";
        CDLLNode traveller;
        
        for(traveller = last.getNext(); traveller != last; traveller = traveller.getNext()) {
            result += traveller.getContent() + ", ";
        }
        result += traveller.getContent() + "]";
        
        return result;
    }
        private CDLLNode<E> getHeader(){
        if(!(isEmpty())){
            return last.getNext();
        }
        return null;
    }
}
