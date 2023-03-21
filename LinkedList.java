package com.bridgelabz.linkedlist;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void push(T Data) {
        Node<T> newNode = new Node<>(Data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head= newNode ;
        }
    }
    public void add(T data) {
        Node<T> newNode= new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.Data + "-> ");
            temp= temp.next;
        }
    }

    public void DeleteFirstElement(T deleted_element) {
//        if(head == null)
//        {
//            System.out.println("List is empty");
//        }
        deleted_element= head.Data;
        if(head==tail)
        {
            head=null;

        }
        if(head!=null){
            head=head.next;
        }
        System.out.println();
        System.out.println("deleted element is "+deleted_element);
    }


    public void DeleteLastElement(T Delete_element) {
        Node<T> temp = head;
        Delete_element = tail.Data;
        if (head == null) {
            System.out.println("Lined list is empty");
        }
        if (head == tail) {
            head = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println();
            System.out.println("Deleted element is " + Delete_element);
        }
    }

    public void search(T search) {
        Node <T> temp = head;
        boolean flag= false;
        while(temp!=null)
        {
            if(temp.Data==search)
            {
                flag=true;
            }
            temp=temp.next;
        }
        if(flag){

            System.out.println("Element found");
        }
        else {
            System.out.println("element not found");

        }
    }
}
