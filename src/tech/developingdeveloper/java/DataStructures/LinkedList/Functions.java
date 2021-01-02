package tech.developingdeveloper.java.DataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

import static tech.developingdeveloper.java.Utils.print;
import static tech.developingdeveloper.java.Utils.println;

/**
 * @author Abhishek Saxena
 * @since 12/08/19 6:35 PM
 */

class Functions {

    static void printLinkedList(Node head) {
        //print LinkedList
        if (head == null) {
            println("Null List!");
            return;
        }

        Node curr = head;
        while (curr != null) {
            print(curr.data);
            if (curr.next != null)
                print("->");
            curr = curr.next;
        }
        println();
    }

    static void deleteNode(Node head) {
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        //println("2nd last Node data: " + curr.data);
        //curr.next = null;
        curr.next = null;
        //return head;
    }

    static Node deleteNode(Node head, int position) {
        if (head == null)
            return null;

        Node curr = head;
        //println("2nd element: " + curr.next.data);
        if (position == 0) {
            head = curr.next;
            return head;
        }

        for (int i = 0; curr != null && i < position - 1; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null)
            return head;

        curr.next = curr.next.next;

        return head;
    }

    static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node prev = head;
        head = head.next;
        Node temp = head;
        prev.next = null;

        while (head.next != null) {
            head = head.next;
            temp.next = prev;
            prev = temp;
            temp = head;
        }
        head.next = prev;
        return head;
    }

    static boolean compareLinkedList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        if (temp1 == null || temp2 == null)
            return false;

        do {
            if (temp1.data != temp2.data)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;

        } while (temp1 != null && temp2 != null);
        return temp1 == null && temp2 == null;
    }

    static Node mergeTwoSortedList(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;
        Node newListTemp = null;
        Node newListHead = null;

        while (temp1 != null && temp2 != null) {
            Node temp;
            if (temp1.data < temp2.data) {
                temp = new Node(temp1.data);
                temp.next = null;
                temp1 = temp1.next;
            } else {
                temp = new Node(temp2.data);
                temp.next = null;
                temp2 = temp2.next;
            }
            if (newListTemp == null) {
                newListTemp = temp;
                newListHead = newListTemp;
            } else {
                newListTemp.next = temp;
                newListTemp = temp;
            }
        }

        if (temp1 != null && newListTemp != null)
            newListTemp.next = temp1;

        if (temp2 != null && newListTemp != null)
            newListTemp.next = temp2;

        return newListHead;
    }


    static Node deleteDuplicates(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = head;

        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }

        return head;
    }

    static boolean detectCycles(Node head) {
        if (head == null)
            return false;

        Node temp = head;
        Set<Node> set = new HashSet<>();

        while (temp != null) {
            if (set.contains(temp)) {
                return true;
            } else {
                set.add(temp);
                temp = temp.next;
            }
        }

        return false;
    }

    static Node detectCyclesAndRemoveCycle(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        Node prev = null;

        Set<Node> set = new HashSet<>();

        while (temp != null) {
            if (set.contains(temp)) {
                prev.next = null;
                return head;
            } else {
                set.add(temp);
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }


    static Node createLinkedListAddAtTheEnd() {
        Node head = null;

        for (int i = 0; i < 10; i++) {
            Node temp = new Node(i + 1);
            if (head == null) {
                head = temp;
            } else {
                Node curr = head;
                while (curr.next != null)
                    curr = curr.next;

                curr.next = temp;
                //printLinkedList(head);
            }
        }
        return head;
    }

    static Node createLinkedListAddAtTheEnd(int[] arr) {
        Node head = null;

        for (int value : arr) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
            } else {
                Node curr = head;
                while (curr.next != null)
                    curr = curr.next;

                curr.next = temp;
            }
        }
        return head;
    }

    static Node createLinkedListAddAtTheBeginning() {
        Node head = null;
        for (int i = 0; i < 10; i++) {
            Node temp = new Node(i + 1);
            temp.next = head;
            head = temp;
            //printLinkedList(head);
        }
        return head;
    }

    static Node insertAtAPosition(Node head, int data, int position) {
        if (head == null)
            return null;

        Node temp = new Node(data);

        if (position == 0) {
            temp.next = head;
            head = temp;
            return head;
        }

        Node curr = head;

        for (int i = 0; curr != null && i < position - 1; i++)
            curr = curr.next;

        if (curr == null)
            return head;

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static Node deleteNodesGreaterThanValue(Node head, int value) {

        while (head != null) {
            if (head.data > value)
                head = head.next;
            else
                break;
        }

        if (head == null)
            return null;

        Node prev = head;
        Node temp = head.next;

        while (temp != null) {
            //println("temp.data: " + temp.data);
            if (temp.data > value) {
                while (temp != null) {
                    if (temp.data > value)
                        temp = temp.next;
                    else
                        break;
                }
            }

            if (temp != null) {
                prev = temp;
                temp = temp.next;
            } else
                prev.next = null;
        }
        return head;
    }


}
