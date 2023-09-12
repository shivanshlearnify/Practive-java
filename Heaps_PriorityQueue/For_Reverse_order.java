
import java.util.*;

public class For_Reverse_order{
    public static void main(String args[]){
      PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

      pq.add(5);
      pq.add(4);
      pq.add(15);
      pq.add(1);
      pq.add(7);
      pq.add(6);

      while(!pq.isEmpty()){
        System.out.print(pq.peek()+" ");
        pq.remove();
      }
      
    }
}
