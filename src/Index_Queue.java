import java.util.*;

public class Index_Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);
//        System.out.println(q);
//        q.remove(); // avoid
//        q.poll();
//        System.out.println(q);
//        System.out.println(q.peek());

        System.out.println(q);

        for (int x : q){
            System.out.println(x);
        }






    }
}
