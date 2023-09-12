import java.util.*;

public class Insert_in_a_heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add to last indx
            arr.add(data);

            int child = arr.size()-1;  //  child index
            int parent = (child-1)/2;

            while(arr.get(child)<arr.get(parent)){
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child = parent;
                parent = (child-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void Heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx !=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                Heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //step 1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2 - delete last
            arr.remove(arr.size()-1);

            // step 3 - Heapify
            Heapify(0);
            return data;
        }
        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }
    
    public static void main(String args[]){
          Heap h = new Heap();
          h.add(3);
           h.add(4);
           h.add(5);
           h.add(1);
           h.add(9);

           while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
           }
          
    }
}
