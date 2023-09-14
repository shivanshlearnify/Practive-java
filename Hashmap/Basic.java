import java.util.*;

public class Basic{
    public static void main(String args[]){
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert O(1)
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);

        // get - O(1)
       
        int population =  hm.get("india");
        System.out.println(population);

        // containsKey

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("bhutan"));

        //remove - O(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        // size 
        System.out.println(hm.size());

        // isEmpty
        
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}