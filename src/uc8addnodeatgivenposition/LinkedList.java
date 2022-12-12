package uc8addnodeatgivenposition;

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
    static int position;

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
    public void checkNodeLL(int value)
    {
        Node current = head;
        int count = 1;
        while (current != null)
        {
            if (current.data == value)
            {
                System.out.println("Searched key : "+value+" is present at node : "+count);
                position = count;
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Searched key is not present in the LinkedList");
    }

    public void addAtParticularPosLL(int value, int index)
    {
        Node currnode = head;
        int count = 1;
        while (currnode != null && count != index)//List starts from 0 so 30 position is 1 and this index
        //represents 2 where 40 will be put.
        {
            currnode = currnode.next;
            count++;
        }
        Node newNode = new Node(value);
        Node temp = currnode.next;
        currnode.next = newNode;
        newNode.next = temp;
    }

    public void printLL()
    {
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
        list.addToLL(30);
        list.addToLL(70);
        System.out.println("Before inserting 40 to the LinkedList");
        list.printLL();
        System.out.println();
        list.checkNodeLL(30);
        list.addAtParticularPosLL(40,position);
        System.out.println("After insert 40 to the LinkedList");
        list.printLL();

    }
}
