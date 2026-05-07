package LinkedList;

public class Q2_Scratch_Implement {

    Node head;
    private int size;

    Q2_Scratch_Implement() {
        size = 0;
    }

    // Fixed Node Class
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++; // Increment size here
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++; // Increment size here

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    // Added a Main method so you can actually run it!
    public static void main(String[] args) {
        Q2_Scratch_Implement list = new Q2_Scratch_Implement();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("working");
        list.printList();
        System.out.println("Size: " + list.getSize());
    }
}