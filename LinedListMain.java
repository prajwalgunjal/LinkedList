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
        System.out.println();
        System.out.println("******  UC5  ******");
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(56);
        linkedList3.add(30);
        linkedList3.add(70);
        System.out.println("Before delete operation");
        linkedList3.display();
        linkedList3.DeleteFirstElement(56);
        System.out.println("After delete first element operation");
        linkedList3.display();
        System.out.println();
        System.out.println("******  UC6  ******");
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.add(56);
        linkedList4.add(30);
        linkedList4.add(70);
        System.out.println("Before delete operation");
        linkedList4.display();
        linkedList4.DeleteLastElement(70);
        System.out.println("After delete last element operation");
        linkedList4.display();
        LinkedList<Integer> linkedList5 = new LinkedList<>();
//        linkedList5.DeleteFirstElement(10);
        System.out.println();
        System.out.println("******  UC7  ******");
        LinkedList<Integer> linkedList6 = new LinkedList<>();
        linkedList6.add(56);
        linkedList6.add(30);
        linkedList6.add(70);
        linkedList6.search(70);
    }
}