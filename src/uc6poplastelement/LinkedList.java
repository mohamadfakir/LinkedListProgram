package uc6poplastelement;

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
    public void popLast()
    {
        if (head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            if (head != tail)
            {
                Node currnode = head;
                while (currnode.next.next != null)
                {
                    currnode = currnode.next;
                }
                tail = currnode;
                tail.next = null;
            }
            else
            {
                head = tail = null;
            }
        }
    }

    public void printLl() {
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
        list.addToLL(56);
        list.addToLL(70);
        list.printLl();
        list.addAfterParticularNodeLL(30);
        System.out.println();
        list.printLl();
        list.popLast();
        System.out.println();
        System.out.println("After removing last element from Linked List");
        list.printLl();
    }

}
