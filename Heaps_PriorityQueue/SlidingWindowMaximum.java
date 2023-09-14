import java.util.*;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int value;
        int idx;

        public Pair(int value, int idx){
            this.value= value;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.value - this.value;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k =3;  // window size
        int result [] = new int[arr.length-k+1];  // n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window i.e First 3 Subaaray
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }
        // taking the maximum i.e First value of pq  to result array
        result[0]=pq.peek().value;


        for(int i=k; i<arr.length; i++){ // this loop will help us to add from array arr to pq
            while(pq.size()>0 && pq.peek().idx <= (i-k)) { // here means agar pq nill hota hai aur pq ka element ka index current sub array ka index mai ko match nahi karta
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));// adding new element from arr to pq
            result[i-k+1] = pq.peek().value;// i-k+1 will give result index where to add element

        }
        // print result 
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();

    }
}