package sampleData;

import java.util.Stack;

public class StackSample {
    public StackSample() {
    }

    public static void stackAdd(Stack<Integer> stack, int size) {
        for(int i = 0; i < size; ++i) {
            stack.push(i);
        }

    }

    public static void stackRemove(Stack<Integer> stack, int element) {
        stack.remove(element);
    }

    public static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        }

    }
}
