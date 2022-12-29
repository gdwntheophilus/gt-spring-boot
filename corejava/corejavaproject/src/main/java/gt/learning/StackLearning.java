package gt.learning;

import java.util.Stack;

public class StackLearning {
    public void learnStack() {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("A"));
    }
}
