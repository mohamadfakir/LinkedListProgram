package uc2addnodeatbegining;

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
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = null;
        }
    }
    public void printLL() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "  ");
            currnode = currnode.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLL(70);
        list.addToLL(30);
        list.addToLL(56);
        list.printLL();
    }
}
