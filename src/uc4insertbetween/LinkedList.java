package uc4insertbetween;

public class LinkedList {
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

    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLL(56);//56 is added first
        list.addToLL(70);
        list.printLL();
        list.addAfterParticularNodeLL(30);
        System.out.println();
        list.printLL();
    }
}
