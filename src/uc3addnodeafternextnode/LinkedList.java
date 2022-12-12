package uc3addnodeafternextnode;

public class LinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void addToLL(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }
    public void printLL()
    {
        Node currnode = head;
        while (currnode != null)
        {
            System.out.print(currnode.data+"  ");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLL(56);//56 is added first
        list.addToLL(30);//30 is added after 56
        list.addToLL(70);//70 is added after 30
        list.printLL();
    }
}
