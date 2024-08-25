package org.anandi.SWEN20003.workshops.workshop5.q4;

public class LinkedList {
    private Node root;
    private int length;

    public LinkedList() {
        this.root = null;
        this.length = 0;
    }

    public Node root() {
        return root;
    }

    public int length() {
        return length;
    }

    void append(int value) {
        Node node = new Node(value);
        length++;
        if (this.root == null) {
            this.root = node;
        } else {
            Node current = this.root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
            node.setPrev(current);
        }
    }

    void insert(int index, int value) {
        // Cannot insert at index 6, if the length is 5.
        if (index >= 0 && length >= index) {
            Node node = new Node(value);
            length++;

            // special case of setting root
            if (index == 0) {
                if (this.root != null) {
                    node.setNext(root);
                    root.setPrev(node);
                }
                root = node;
            } else {
                int currentIndex = 0;
                Node current = this.root;
                Node previous = this.root;

                while (currentIndex < index) {
                    previous = current;
                    current = current.getNext();
                    currentIndex++;
                }

                // double-check
                if (currentIndex == index) {
                    node.setPrev(previous); //
                    node.setNext(current);

                    previous.setNext(node);
                    if (current != null) current.setPrev(node);
                }
            }
        }
    }


    void remove(int index) {
        // The maximum index of a length n linked list is n-1
        if (index >= 0 && length > index) {
            length--;
            if (index == 0) {
                root = this.root.getNext();
                if (root != null) root.setPrev(null);
            } else {
                int currentIndex = 0;
                Node current = this.root;
                Node previous = this.root;

                while (currentIndex < index) {
                    previous = current;
                    current = current.getNext();
                    currentIndex++;
                }

                if (currentIndex == index) {
                    Node next = current.getNext();
                    previous.setNext(next);
                    if (next != null) next.setPrev(previous);
                }
            }
        }
    }

    public String toString() {
        String result = "[ ";
        Node current = root;
        while (current != null) {
            result += current.value + " ";
            current = current.getNext();
        }
        return result + "]";
    }

}
