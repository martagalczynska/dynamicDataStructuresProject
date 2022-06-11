package sampleData;

import java.util.List;

public class ListSample {
    public ListSample() {
    }

    public static void listAdd(List<Integer> list, int size) {
        for(int i = 0; i < size; ++i) {
            list.add(i);
        }

    }

    public static int listSearch(List<Integer> list, int element) {
        return list.indexOf(element);
    }

    public static void listRemove(List<Integer> list, int element) {
        list.remove(element);
    }
}