/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/*
 *
 * @author alexv
 */
public class CDLLNode<E> {
    private final E content;
    private CDLLNode next;
    private CDLLNode prev;
    
    public CDLLNode(E content) {
        this.content = content;
    }
    
    public E getContent() {
        return content;
    }

    public CDLLNode getNext() {
        return next;
    }

    public void setNext(CDLLNode next) {
        this.next = next;
    }

    public CDLLNode getPrev() {
        return prev;
    }

    public void setPrev(CDLLNode prev) {
        this.prev = prev;
    }
    
    
}
