
import java.util.*;

public class Iteration{
    public static void main(String args[]){
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert O(1)
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

       // Iteration
       Set<String> keys = hm.keySet();
       System.out.println(keys);

       for (String k : keys) {
        System.out.println(k +" "+hm.get(k));
       }
    }
}