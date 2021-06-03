package edu.escuelaing.arsw.LinkedList;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E e) {
        value = e;
        next = null;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
