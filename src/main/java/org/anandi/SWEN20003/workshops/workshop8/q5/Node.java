package org.anandi.SWEN20003.workshops.workshop8.q5;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
