import java.util.Comparator;
import java.util.PriorityQueue;

public class learnPriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(90);
        pq.offer(98);
        pq.offer(978);
        pq.offer(234);
        pq.offer(1);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);//basically it uses the minheap and max heap;;
        System.out.println(pq.peek());


    }
}
