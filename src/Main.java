import timeMeasure.ListTimeMeasure;
import timeMeasure.QueueTimeMeasure;
import timeMeasure.StackTimeMeasure;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ListTimeMeasure.measureListMethods();
        QueueTimeMeasure.measureQueueMethods();
        StackTimeMeasure.measureStackMethods();
    }
}