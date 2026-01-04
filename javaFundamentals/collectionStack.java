package javafundamentals;

import java.util.Stack;

public class collectionStack {
    public static void main(String[] args) {
        //Queue fast than stack
        //Stack last in first out
        //LinkedList implements Deque interface
        Stack<Integer> stack = new Stack<>();

        // push (input data)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        // peek (stack)
        System.out.println("Peek: " + stack.peek());
        // pop (delete data)
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);
   
    }

}
