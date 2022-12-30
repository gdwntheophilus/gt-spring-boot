package gt.learning;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueLearning {
    public void learnQueue(){
        Queue queue = new LinkedList();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        queue.addAll(List.of(
                "D","E"
        ));

        System.out.println(queue);
    }
}
