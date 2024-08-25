package org.anandi.SWEN20003.workshops.workshop5.q4;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        System.out.println(list.toString());
        list.insert(1, 3);
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
    }
}
