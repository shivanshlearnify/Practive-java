import java.util.HashSet;

public class HashsetBasic {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);

        hs.remove(2);

        if(hs.contains(2)){
            System.out.println("true");
        }
          System.out.println(hs);
          hs.clear();
          System.out.println(hs.isEmpty());
          System.out.println(hs.size());

    }
}
