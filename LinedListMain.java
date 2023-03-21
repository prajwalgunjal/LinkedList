package com.bridgelabz.linkedlist;

public class LinedListMain {
    public static void main(String[] args) {
        System.out.println("******  UC1  ******");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.display();
        System.out.println("");
        System.out.println("******  UC2  ******");
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
        System.out.println("");
        System.out.println("******  UC3  ******");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList2.display();

    }

}
