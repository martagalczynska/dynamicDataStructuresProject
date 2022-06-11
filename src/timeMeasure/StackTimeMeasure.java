package timeMeasure;

import java.util.Stack;

import fileCreator.FileWrite;
import sampleData.StackSample;

public class StackTimeMeasure {
    private static Stack<Integer> stack1 = new Stack();
    private static Stack<Integer> stack2 = new Stack();
    private static Stack<Integer> stack3 = new Stack();
    private static Stack<Integer> stack4 = new Stack();
    private static final String stackSize1 = "Stack size 10^3 time: ";
    private static final String stackSize2 = "Stack size 10^5 time: ";
    private static final String stackSize3 = "Stack size 10^7 time: ";
    private static final String stackSize4 = "Stack size 10^9 time: ";

    public StackTimeMeasure() {
    }

    public static void measureStackAdding() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Stack Adding:");
        long startTime = System.nanoTime();
        StackSample.stackAdd(stack1, 1000);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackAdd(stack2, 100000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackAdd(stack3, 10000000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^7 time: " + estimatedTime);
    }

    public static void measureStackSearching() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Stack Searching:");
        long startTime = System.nanoTime();
        StackSample.stackSearch(stack1, 999);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackSearch(stack2, 99999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackSearch(stack3, 9999999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^7 time: " + estimatedTime);
    }

    public static void measureStackRemoving() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Stack Removing:");
        long startTime = System.nanoTime();
        StackSample.stackRemove(stack1, 999);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackRemove(stack2, 99999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        StackSample.stackRemove(stack3, 9999999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Stack size 10^7 time: " + estimatedTime);
    }

    public static void measureStackMethods() {
        measureStackAdding();
        measureStackSearching();
        measureStackRemoving();
    }
}