package uc7searchelement;

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

    public void addToLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }
    public void checkNode(int value)
    {
        Node currnode = head;
        int count = 1;
        while (currnode != null)
        {
            if (currnode.data == value)
            {
                System.out.println("Searched key : "+value+" is present at node : "+count);
                return;
            }
            currnode = currnode.next;
            count++;
        }
        System.out.println("Searched key is not present in the LinkedList");
    }
    public void printLL() {
        Node currnode = head;
        if (head == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        while (currnode != null)
        {
            System.out.print(currnode.data+"  ");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLinkedList(56);
        list.addToLinkedList(30);
        list.addToLinkedList(70);
        list.printLL();
        System.out.println();
        list.checkNode(30);
    }

}
