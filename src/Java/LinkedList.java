package Java;

import java.util.Scanner;

/*
Input:4 2 3 4  1
*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    private static Node insert(Node head, int data) {
        if (head == null)
            return new Node(data);
        else if (head.next == null)
            head.next = new Node(data);
        else
            insert(head.next, data);

        return head;
    }

    private static void display(Node head){
        Node start = head;

        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        display(head);
        sc.close();
    }
}
