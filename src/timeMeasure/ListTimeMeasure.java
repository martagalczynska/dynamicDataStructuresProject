package timeMeasure;

import java.util.LinkedList;
import java.util.List;

import fileCreator.FileWrite;
import sampleData.ListSample;

public class ListTimeMeasure {
    private static List<Integer> list1 = new LinkedList();
    private static List<Integer> list2 = new LinkedList();
    private static List<Integer> list3 = new LinkedList();
    private static List<Integer> list4 = new LinkedList();
    private static final String listSize1 = "List size 10^3 time: ";
    private static final String listSize2 = "List size 10^5 time: ";
    private static final String listSize3 = "List size 10^7 time: ";
    private static final String listSize4 = "List size 10^9 time: ";

    public ListTimeMeasure() {
    }

    public static void measureListAdding() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("List Adding:");
        long startTime = System.nanoTime();
        ListSample.listAdd(list1, 1000);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listAdd(list2, 100000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listAdd(list3, 10000000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^7 time: " + estimatedTime);
    }

    public static void measureListSearching() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("List Searching:");
        long startTime = System.nanoTime();
        ListSample.listSearch(list1, 1000);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listSearch(list2, 100000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listSearch(list3, 10000000);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^7 time: " + estimatedTime);
    }

    public static void measureListRemoving() {
        FileWrite fileWrite = new FileWrite();
        fileWrite.writeToFile("List Removing:");
        long startTime = System.nanoTime();
        ListSample.listRemove(list1, 999);
        long estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^3 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listRemove(list2, 99999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^5 time: " + estimatedTime);
        startTime = System.nanoTime();
        ListSample.listRemove(list3, 9999999);
        estimatedTime = System.nanoTime() - startTime;
        fileWrite.writeToFile("List size 10^7 time: " + estimatedTime);
    }

    public static void measureListMethods() {
        measureListAdding();
        measureListSearching();
        measureListRemoving();
    }
}