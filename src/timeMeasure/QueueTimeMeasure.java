package timeMeasure;

import java.util.LinkedList;
import java.util.Queue;

import fileCreator.FileWrite;
import sampleData.QueueSample;

public class QueueTimeMeasure {
    private static Queue<Integer> queue1 = new LinkedList();
    private static Queue<Integer> queue2 = new LinkedList();
    private static Queue<Integer> queue3 = new LinkedList();
    private static Queue<Integer> queue4 = new LinkedList();
    private static final String queueSize1 = "Queue size 10^3 time: ";
    private static final String queueSize2 = "Queue size 10^5 time: ";
    private static final String queueSize3 = "Queue size 10^7 time: ";
    private static final String queueSize4 = "Queue size 10^9 time: ";

    public QueueTimeMeasure() {
    }

    public static void measureQueueAdding() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Queue Adding:");
        long startTime = System.nanoTime();
        QueueSample.queueAdd(queue1, 1000);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueAdd(queue2, 100000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueAdd(queue3, 10000000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^7 time: " + estimatedTime);
    }

    public static void measureQueueSearching() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Queue Searching:");
        long startTime = System.nanoTime();
        QueueSample.queueSearch(queue1, 999);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueSearch(queue2, 99999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueSearch(queue3, 9999999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^7 time: " + estimatedTime);
    }

    public static void measureQueueRemoving() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("Queue Removing:");
        long startTime = System.nanoTime();
        QueueSample.queueRemove(queue1, 1000);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueRemove(queue2, 100000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        QueueSample.queueRemove(queue3, 10000000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("Queue size 10^7 time: " + estimatedTime);
    }

    public static void measureQueueMethods() {
        measureQueueAdding();
        measureQueueSearching();
        measureQueueRemoving();
    }
}
