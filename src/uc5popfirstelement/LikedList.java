package uc5popfirstelement;

import uc1createlinkedlist.LinkedList;

public class LikedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void addToLL(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }
    public void addAfterParticularNodeLL(int value) {
        Node currnode = head;
        while (currnode != null) {
            if (!(currnode.data == 56)) {
                currnode = currnode.next;
            } else if (currnode.data == 56) {
                break;
            }
        }
        Node newNode = new Node(value);
        Node temp = currnode.next;
        currnode.next = newNode;
        newNode.next = temp;
    }
    public void pop()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            if (head != tail)
            {
                head = head.next;
            }
            else
            {
                head = tail = null;
            }
        }
    }


    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLL(56);
        list.addToLL(70);
        list.printLL();
        list.addToLL(30);
        System.out.println();
        list.printLL();
        list.printLL();
        System.out.println();
        System.out.println("After removing first element from Linked List");
        list.printLL();
    }

}
