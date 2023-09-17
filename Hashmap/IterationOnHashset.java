import java.util.*;

public class IterationOnHashset {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("haldwani");
        cities.add("delhi");
        cities.add("banglore");
        cities.add("pune");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //    System.out.println(it.next());
        // }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
