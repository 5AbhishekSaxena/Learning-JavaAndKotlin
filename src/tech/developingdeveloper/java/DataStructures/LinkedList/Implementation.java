package tech.developingdeveloper.java.DataStructures.LinkedList;

import java.util.Scanner;

import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.compareLinkedList;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.createLinkedListAddAtTheBeginning;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.createLinkedListAddAtTheEnd;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.deleteNode;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.deleteNodesGreaterThanValue;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.detectCycles;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.detectCyclesAndRemoveCycle;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.insertAtAPosition;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.mergeTwoSortedList;
import static tech.developingdeveloper.java.DataStructures.LinkedList.Functions.printLinkedList;
import static tech.developingdeveloper.java.Utils.print;
import static tech.developingdeveloper.java.Utils.println;

/**
 * @author Abhishek Saxena
 * @since 12/08/19 9:17 PM
 */

class Implementation {

    public static void main(String[] args) {
        int ch = -1;
        Node head = null;
        int[] arr = {3, 4, 7, 8, 10, 20, 50};
        int[] duplicateArr = {3, 4, 4, 8, 10, 20, 20, 25, 25, 50};
        Scanner scanner = new Scanner(System.in);
        do {
            println("Menu");
            println("1. Create new LinkedList with 1..10");
            println("2. Create new LinkedList with 10...1");
            println("3. Create new LinkedList (array)");
            println("4. Reverse LinkedList");
            println("5. Merge Two LinkedLst");
            println("6. Compare Lists");
            println("7. Insert at a position");
            println("8. Delete Last Element");
            println("9. Delete Element using position");
            println("10. Delete Duplicate values in LinkedList");
            println("11. Cycle Detection - Custom linked list to be made");
            println("12. Cycle Detection and Removal - Custom linked list to be made");
            println("13. Delete all nodes greater than given value");
            println("98. Print LinkedList");
            println("99. Exit");
            println("Enter Choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    head = createLinkedListAddAtTheEnd();
                    printLinkedList(head);
                    break;
                case 2:
                    head = createLinkedListAddAtTheBeginning();
                    printLinkedList(head);
                    break;
                case 3:
                    head = createLinkedListAddAtTheEnd(arr);
                    printLinkedList(head);
                    break;
                case 4:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd();
                    printLinkedList(Functions.reverseLinkedList(head));
                    break;
                case 5:
                    head = createLinkedListAddAtTheEnd();
                    Node head2 = createLinkedListAddAtTheEnd(arr);
                    printLinkedList(mergeTwoSortedList(head, head2));
                    break;
                case 6:
                    head = createLinkedListAddAtTheEnd();
                    head2 = createLinkedListAddAtTheEnd();
                    print("List1: ");
                    printLinkedList(head);
                    print("List2: ");
                    printLinkedList(head2);
                    print(compareLinkedList(head, head2) ? "Same" : "Difference");
                case 7:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd();
                    print("Before: ");
                    printLinkedList(head);
                    print("Enter value: ");
                    int data = scanner.nextInt();
                    print("Enter position: ");
                    int position = scanner.nextInt();
                    head = insertAtAPosition(head, data, position);
                    print("After: ");
                    printLinkedList(head);
                    break;
                case 8:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd(arr);
                    print("Before: ");
                    printLinkedList(head);
                    deleteNode(head);
                    print("After: ");
                    printLinkedList(head);
                    break;
                case 9:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd(arr);
                    print("Before: ");
                    printLinkedList(head);
                    print("Enter Position: ");
                    position = scanner.nextInt();
                    deleteNode(head, position);
                    print("After: ");
                    printLinkedList(head);
                    break;
                case 10:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd(duplicateArr);
                    print("Original List: ");
                    printLinkedList(head);
                    printLinkedList(Functions.deleteDuplicates(head));
                    break;
                case 11:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd();
                    detectCycles(head);
                    break;
                case 12:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd();
                    print("Original List: ");
                    printLinkedList(head);
                    printLinkedList(detectCyclesAndRemoveCycle(head));
                    break;
                case 13:
                    if (head == null)
                        head = createLinkedListAddAtTheEnd(new int[]{51, 25, 75, 8, 2, 1, 1, 54});

                    print("Original List: ");
                    printLinkedList(head);
                    println("Enter value: ");
                    printLinkedList(deleteNodesGreaterThanValue(head, scanner.nextInt()));
                    break;
                case 98:
                    printLinkedList(head);
                    break;
                case 99:
                    System.exit(0);
                    break;
                default:
                    println("Invalid Option Chosen");
                    break;
            }
        } while (true);
    }
}
