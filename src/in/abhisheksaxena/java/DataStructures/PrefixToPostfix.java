package in.abhisheksaxena.java.DataStructures;

import java.util.Stack;

import static in.abhisheksaxena.java.Utils.isOperator;
import static in.abhisheksaxena.java.Utils.print;
import static in.abhisheksaxena.java.Utils.println;

/**
 * @author Abhishek Saxena
 * @since 13/08/19 4:58 PM
 */

class PrefixToPostfix {

    static char[] expression = "*+AB-CD".toCharArray();

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();


        for (int i = expression.length - 1; i >= 0; i--) {
            if (isOperator(expression[i])) {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push(op1 + op2 + expression[i]);
            } else {
                stack.push(expression[i] + "");
            }
        }
        println(stack.peek());
    }
}


