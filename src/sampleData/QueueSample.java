package sampleData;

import java.util.Iterator;
import java.util.Queue;

public class QueueSample {
    public QueueSample() {
    }

    public static void queueAdd(Queue<Integer> queue, int size) {
        for(int i = 0; i < size; ++i) {
            queue.add(i);
        }

    }

    public static int queueSearch(Queue<Integer> queue, int index) {
        Iterator it = queue.iterator();

        for(int count = 0; it.hasNext(); ++count) {
            Object e = it.next();
            if (count == index) {
                it.remove();
                return (Integer)e;
            }
        }

        return 0;
    }

    public static void queueRemove(Queue<Integer> queue, int element) {
        queue.remove(element);
    }
}
