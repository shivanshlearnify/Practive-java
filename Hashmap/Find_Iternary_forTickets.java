import java.util.HashMap;

public class Find_Iternary_forTickets{
    public static String getstart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
          revMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key)){
                return key; // this key is starting point because it exist in tickets map not in revmap
            }
        }
        return null;
       
    }
    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("mumbai", "delhi");
        tickets.put("chennai", "bengaluru");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
        
        String start = getstart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("--> "+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}