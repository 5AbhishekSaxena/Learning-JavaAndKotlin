package tech.developingdeveloper.java;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Abhishek Saxena on 26-09-2018.
 */

public class Palindrome {

    private Stack<Character> stack;
    private LinkedList<Character> queue;

    private Palindrome(){
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome p = new Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    private char dequeCharacter() {
        return queue.pop();
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private void pushCharacter(char c) {
        stack.push(c);
    }
}
