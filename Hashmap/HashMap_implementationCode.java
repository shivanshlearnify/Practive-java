import java.util.*;

public class HashMap_implementationCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N = bucket.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes --> add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // here we are calling hash(fx) that convert key to index where to add data or
                                        // at which indx key exist
            int di = SearchInLL(key, bi); // by this function we are searching in LinkedList at particalar index here we
                                          // have 2 case key exist or key don't exist

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key){
             int bi = hashFunction(key); 
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid value
                return true;
            } else {
                return false;
            }
        }
        public V get (K key) {
            int bi = hashFunction(key); 
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
               return null;
            }
        }
        public V remove(K key){
             int bi = hashFunction(key); 
            int di = SearchInLL(key, bi); 

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        public ArrayList<K> keyset(){
              ArrayList<K> keys = new ArrayList<>();

              for(int i=0; i<buckets.length; i++){
                  LinkedList<Node> ll = buckets[i];
                  for (Node node: ll){
                    keys.add(node.key);
                  }
              }
              return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }

    }

    public static void main(String args[]) {
         HashMap<String, Integer> hm = new HashMap<>();
         hm.put("india", 100);
         hm.put("us", 50);
         hm.put("china", 150);
         hm.put("nepal", 10);

         ArrayList<String> keys =  hm.keyset();
         for (String key : keys) {
            System.out.println(key);
         }
    }
}
