package uc10sortlinkedlist;

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

    public void sortTheLL()
    {
        Node currnode = head, index = null;
        int temp;
        while (currnode != null)
        {
            if(head == null)
            {
                return;
            }
            else
            {
                index = currnode.next;
                while (index != null)
                {
                    if (currnode.data > index.data)
                    {
                        temp = currnode.data;
                        currnode.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                currnode = currnode.next;
            }
        }
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
        list.addToLL(40);
        list.addToLL(70);
        System.out.println("Before sorting the LinkedList");
        list.printLL();
        list.sortTheLL();
        System.out.println();
        System.out.println("After sorting the LinkedList");
        list.printLL();

    }
}
