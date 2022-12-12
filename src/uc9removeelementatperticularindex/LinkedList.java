package uc9removeelementatperticularindex;

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
    static int position;

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

    public void checkNodeLL(int value) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (current.data == value) {
                System.out.println("Searched key : " + value + " is present at node : " + count);
                position = count;
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Searched key is not present in the LinkedList");
    }

    public void addAtParticularPosLL(int value, int index) {
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

    public void pop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void popLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head != tail) {
                Node currnode = head;
                while (currnode.next.next != null) {
                    currnode = currnode.next;
                }
                tail = currnode;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void popNodeAtAGivenIndex(int index) {

        if (index == 1) {
            pop();
        } else if (index == getLLSize()) {
            popLast();
        } else {
            int count = 1;
            Node currnode = head;
            while (currnode != null && count != index) {
                currnode = currnode.next;
                count++;
            }
            currnode.next = currnode.next.next;
        }
    }

    public int getLLSize() {
        Node currnode = head;
        int count = 0;
        while (currnode != null) {

            currnode = currnode.next;
            count++;
        }
        return count;
    }

    public void printLL() {
        Node currnode = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while (currnode != null) {
            System.out.print(currnode.data + "  ");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLL(56);
        list.addToLL(30);
        list.addToLL(70);
        System.out.println("Before adding 40 to the LinkedList");
        list.printLL();
        System.out.println();
        list.checkNodeLL(30);
        list.addAtParticularPosLL(40, position);
        System.out.println("After adding 40 to the LinkedList");
        list.printLL();
        list.popNodeAtAGivenIndex(position);
        System.out.println("\nAfter removing 40 from linked list");
        list.printLL();

    }
}
