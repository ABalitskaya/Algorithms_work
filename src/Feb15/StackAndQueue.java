package Feb15;

import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(8);
        stack.push(2);
        stack.push(3);
        stack.push(9);
        stack.push(7);
        System.out.println("Stack" + stack);

        Integer peekedElement = stack.peek();
        System.out.println("PeededElement" + peekedElement);
        System.out.println("Stack" + stack);

        Integer poppedElement = stack.pop();
        System.out.println("PoppedElement" + poppedElement);
        System.out.println("Stack" + stack);


        int searchResOf8 =  stack.search(8);
        int searchResOf11 = stack.search(11);
        System.out.println("searchOf8" + searchResOf8);
        System.out.println("searchOf11" + searchResOf11);
    }
}
